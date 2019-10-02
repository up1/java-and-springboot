package com.example.demorest.hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MessageRepositoryTest {

    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void findByName() {
        Message message = new Message();
        message.setName("somkiat");
        message.setEmail("somkiat@pui");
        messageRepository.save(message);

        Optional<Message> result =  messageRepository.findByName("somkiat");
        assertTrue(result.isPresent());
        assertEquals("somkiat", result.get().getName());
        assertEquals("somkiat@pui", result.get().getEmail());

    }

}