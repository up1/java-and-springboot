package com.example.demorest.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

    @Autowired
    private MessageRepository messageRepository;

    public String process(String name) {
        Optional<Message> result =  messageRepository.findByName(name);
        if(result.isPresent()){
            return "Hello " + result.get().getName();
        }
        return "Data not found with name= " + name;
    }

}
