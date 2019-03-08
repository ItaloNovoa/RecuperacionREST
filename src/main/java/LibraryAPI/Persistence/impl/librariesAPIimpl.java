package LibraryAPI.Persistence.impl;

import org.springframework.stereotype.Service;

import LibraryAPI.Persistence.LibraryAPIPersistence;
import LibraryAPI.Persistence.LibraryException;
import LibraryAPI.model.ConjuntoLibrerias;
import LibraryAPI.model.Libreria;
import LibraryAPI.model.hilo;
import LibraryAPI.model.libro;


@Service
public class librariesAPIimpl implements LibraryAPIPersistence {


	private final ConjuntoLibrerias cl=new ConjuntoLibrerias();

	public librariesAPIimpl() {
		Libreria l= new Libreria(1001, "libreriaSuba", "no se", 132135);
		l.añadirLibro(new libro(001, "prueba1", "asd", "dsadasdasdsad"));
		l.añadirLibro(new libro(002, "prueba2", "asdfdg", "dsadagfsdasdsad"));		
		cl.addLibreria(l);


		Libreria l1= new Libreria(1002, "libreriaX", "menos", 13213523);
		l1.añadirLibro(new libro(003, "prueba3", "asdasd", "dsadasdasfdsfssdsad"));
		l1.añadirLibro(new libro(004, "prueba4", "asddsdfdg", "dsadagfsdfdsfsdasdsad"));		
		cl.addLibreria(l1);		

		Libreria l2= new Libreria(1004, "libreriaVacia", "juum", 132135123);
		cl.addLibreria(l2);	
	}



	@Override
	public java.util.List<Libreria> getLibrerias() throws LibraryException {		
		return cl.getLibrerias();
	}

	@Override
	public java.util.List<libro> getLibrosPorLibreria(String libreria) throws LibraryException {
		for(Libreria l:cl.getLibrerias()) {
			if(l.getNombre().equals(libreria)) {
				return l.getLibros();
			}
		}
		return null;
	}



	@Override
	public void delete(String libreria) {
		for(int i=0;i<cl.getLibrerias().size();i++) {
			if(cl.getLibrerias().get(i).getNombre().equals(libreria)) {
				if(cl.getLibrerias().get(i).getLibros().size()==0) {
					cl.getLibrerias().remove(i);
				}
			}
		}

	}



	@Override
	public void añadirLibreria(Libreria l) {
		hilo h=new hilo();
		cl.addLibreria(l);
	}

}
