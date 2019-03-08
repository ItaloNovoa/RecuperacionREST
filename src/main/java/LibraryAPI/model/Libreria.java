package LibraryAPI.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 2135142
 *
 */
public class Libreria {
	
	long id;
	String nombre;
	String direccion;
	long telefono;
	List<libro> libros= new ArrayList<libro>();
	
	
	
	
	public Libreria() {		
	}
	
	
	public Libreria(long id, String nombre, String direccion, long telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	
	
	public void añadirLibro(libro l) {
		libros.add(l);
	}
	
	public List<libro> getLibros() {
		return libros;
	}


	public void setLibros(List<libro> libros) {
		this.libros = libros;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
	
	

	
	

}
