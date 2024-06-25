package jeffersonrolino.com.github.spring_store.controllers.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import jeffersonrolino.com.github.spring_store.services.exceptions.DatabaseException;
import jeffersonrolino.com.github.spring_store.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException resourceNotFoundException, HttpServletRequest httpServletRequest){
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(
                Instant.now(), status.value(),
                error,
                resourceNotFoundException.getMessage(),
                httpServletRequest.getRequestURI()
        );

        return ResponseEntity.status(status).body(standardError);
    }

    @ExceptionHandler({DatabaseException.class})
    public ResponseEntity<StandardError> database(DatabaseException databaseException, HttpServletRequest httpServletRequest){
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError standardError = new StandardError(
                Instant.now(), status.value(),
                error,
                databaseException.getMessage(),
                httpServletRequest.getRequestURI()
        );

        return ResponseEntity.status(status).body(standardError);
    }
}
