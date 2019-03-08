package LibraryAPI.controllers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import LibraryAPI.Persistence.LibraryException;
import LibraryAPI.Persistence.LibraryPersistenceException;
import LibraryAPI.Services.LibraryAPIService;
import LibraryAPI.model.Libreria;

import javax.xml.ws.http.HTTPException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping(value = "/libraries")
@Service
public class LibraryAPIcontroller {
	
	
	 @Autowired
	 LibraryAPIService ls;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> getLibrerias() throws LibraryPersistenceException, LibraryException{
        try {            
            return new ResponseEntity<>(ls.getLibrerias(),HttpStatus.ACCEPTED);
        } catch (HTTPException ex) {
            Logger.getLogger(LibraryAPIcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.toString(),HttpStatus.valueOf(ex.getStatusCode()));
        }      
    }
	
	
	
	@RequestMapping(value="/{libreriaVacia}",method = RequestMethod.DELETE)
	public ResponseEntity<?> delete(@PathVariable String libreriaVacia) throws LibraryException {		
		 try {  
			 System.out.println("sirve");
			 ls.delete(libreriaVacia);
			 return new ResponseEntity<>( "Libreria Eliminada",HttpStatus.ACCEPTED);           
	     } catch (HTTPException ex) {
	    	 Logger.getLogger(LibraryAPIcontroller.class.getName()).log(Level.SEVERE, null, ex);
	        return new ResponseEntity<>(ex.toString(),HttpStatus.NOT_ACCEPTABLE);
	      }
	    
	}
	
	@RequestMapping(value= "/{libreria}" ,method = RequestMethod.GET)
	public ResponseEntity<?> getLibrosPorLibreria(@PathVariable String libreria) throws LibraryPersistenceException, LibraryException{
        try {  
        	
        	if(ls.getLibrosPorLibreria(libreria).size()==0) {
        		return new ResponseEntity<>("libreria Vacia",HttpStatus.NOT_FOUND);
        	}
        	return new ResponseEntity<>(ls.getLibrosPorLibreria(libreria),HttpStatus.ACCEPTED);
        } catch (HTTPException ex) {
            Logger.getLogger(LibraryAPIcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.toString(),HttpStatus.valueOf(ex.getStatusCode()));
        
       }
	}
	
	
	//curl -i -X POST -HContent-Type:application/json -HAccept:application/json http://localhost:8080/libraries/correo -d '{"id":1001,"nombre":"libreriaPrueba","direccion":"no sasdae","telefono":132121135,"libros":[{"id":100,"nombre":"prueba10","autor":"asdasdsa","sinopsis":"dsadasdasasdsadsad"}]}'
	@RequestMapping(value= "/{correo}",method = RequestMethod.POST)
	public ResponseEntity<?> getLibrosPorLibreria(@PathVariable String correo,@RequestBody Libreria l) throws LibraryPersistenceException, LibraryException{
        try {  
        	//System.out.println("entra");
        	ls.añadirLibreria(l,correo);
        	return new ResponseEntity<>("libreria añadida",HttpStatus.ACCEPTED);
        } catch (HTTPException ex) {
            Logger.getLogger(LibraryAPIcontroller.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.toString(),HttpStatus.valueOf(ex.getStatusCode()));
        
       }
	}
	
	

}
