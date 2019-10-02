package com.example.bookstore.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
public class HelloControllerAdvice {

    @ExceptionHandler(value = {IOException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse badRequest(Exception ex) {
        return new ErrorResponse(400, "Bad Request");
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse unKnownException(Exception ex) {
        return new ErrorResponse(404, "Data Not Found");
    }

}

