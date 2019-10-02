package com.example.demorest.hello;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class HelloResponse {
    private String message;

    public HelloResponse() {
    }

    public HelloResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
