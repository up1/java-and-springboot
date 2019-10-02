package com.example.demorest.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

    private MessageRepository messageRepository;

    @Autowired
    public HelloService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String process(String name){
        throw new RuntimeException("Fake data");
//        Optional<Message> result =  messageRepository.findByName(name);
//        if(result.isPresent()){
//            if("fake".equals(result.get().getName())) {
//                throw new FakeException();
//            }
//            return "Hello " + result.get().getName();
//        }
//        return "Data not found with name= " + name;
    }

}
