package com.workintech.meyve_sebze.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class FruitException extends RuntimeException {

    private HttpStatus status;

    public FruitException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
