package LibraryAPI.model;

/**
 * @author 2135142
 *
 */
public class libro {
	long id;
	String nombre;
	String autor;
	String sinopsis;
	
	public libro() {
		
	}
	
	
	
	public libro(long id, String nombre, String autor, String sinopsis) {
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.sinopsis = sinopsis;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	
	
	

}
