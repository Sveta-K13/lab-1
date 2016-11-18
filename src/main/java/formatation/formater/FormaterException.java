package formatation.formater;

import formatation.formater.starter.StarterException;

/**
 * Created by s.krivosheeva on 18.11.2016.
 */
public class FormaterException extends RuntimeException{
    public FormaterException(String message, Throwable cause) {
        super(message, cause);
    }
}
