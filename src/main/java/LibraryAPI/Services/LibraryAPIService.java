package LibraryAPI.Services;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LibraryAPI.Persistence.LibraryAPIPersistence;
import LibraryAPI.Persistence.LibraryException;
import LibraryAPI.Persistence.LibraryPersistenceException;
import LibraryAPI.model.Libreria;
import LibraryAPI.model.libro;

@Service
public class LibraryAPIService {

	@Autowired
	LibraryAPIPersistence lp=null;
	
	
	public List<Libreria> getLibrerias() throws LibraryPersistenceException, LibraryException{
		return lp.getLibrerias();
	};


	


	public List<libro> getLibrosPorLibreria(String libreria) throws LibraryException {		
		return lp.getLibrosPorLibreria(libreria);
	}





	public void delete(String libreria) throws LibraryException  {
		
		lp.delete(libreria);
	}





	public void añadirLibreria(Libreria l,String correo) {
		
		lp.añadirLibreria(l,correo);
	}

}
