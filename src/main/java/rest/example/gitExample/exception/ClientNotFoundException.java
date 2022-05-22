package rest.example.gitExample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ClientNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    public ClientNotFoundException(String message) {
        super(message);
    }

}