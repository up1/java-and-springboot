package com.example.demorest.hello;

public class FakeException extends RuntimeException {
    public FakeException(String fake_data) {
        super(fake_data);
    }
}
