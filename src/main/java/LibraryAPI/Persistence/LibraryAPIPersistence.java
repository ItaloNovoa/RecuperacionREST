package LibraryAPI.Persistence;

import java.util.List;
import java.util.Set;

import LibraryAPI.model.Libreria;
import LibraryAPI.model.libro;

public interface LibraryAPIPersistence {

	public List<Libreria> getLibrerias() throws LibraryException;

	public List<libro> getLibrosPorLibreria(String libreria) throws LibraryException;

	public void delete(String libreria);

	public void añadirLibreria(Libreria l);

	

	

	
	
	

}
