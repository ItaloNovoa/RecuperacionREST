package LibraryAPI.model;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoLibrerias {
	List<Libreria>  librerias=new ArrayList<Libreria>();;


	public ConjuntoLibrerias() {			

	} 	


	public ConjuntoLibrerias(List<Libreria> librerias) {

		this.librerias = librerias;
	} 
	
	
	public void addLibreria(Libreria l) {
		librerias.add(l);
	}
	
	public List<libro> obtenerLibrosPorLibreria(Libreria l){
		return l.getLibros();		
	}

	public List<Libreria> getLibrerias() {
		return librerias;
	}

	public void setLibrerias(List<Libreria> librerias) {
		this.librerias = librerias;
	}




}
