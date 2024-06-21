package jeffersonrolino.com.github.spring_store.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id: " + id);
    }
}
