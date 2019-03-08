package LibraryAPI.Persistence;

public class LibraryPersistenceException extends Exception{
	
	public LibraryPersistenceException(String message) {
		super(message);
	}

    public LibraryPersistenceException(String message, Throwable cause) {
        super(message, cause);
    } 

}
