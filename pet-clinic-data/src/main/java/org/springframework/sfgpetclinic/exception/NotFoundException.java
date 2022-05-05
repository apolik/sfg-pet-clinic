package org.springframework.sfgpetclinic.exception;

/**
 * Created by Polik on 5/5/2022
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
