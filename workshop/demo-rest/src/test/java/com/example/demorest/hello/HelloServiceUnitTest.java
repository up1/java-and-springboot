package com.example.demorest.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class HelloServiceUnitTest {

    @Mock
    private MessageRepository messageRepository;

    @Test
    public void name_not_found() {
        given(messageRepository.findByName("xxx"))
                .willReturn(Optional.empty());

        HelloService service = new HelloService(messageRepository);
        String result = service.process("xxx");
        assertEquals("Data not found with name= xxx", result);
    }
}