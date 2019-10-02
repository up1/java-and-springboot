package com.example.demorest.hello;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerSpringBootWithMockBeanTest {

    @MockBean
    private MessageRepository messageRepository;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void sayHi() {
        Message somkiat = new Message();
        somkiat.setName("somkiat");
        somkiat.setEmail("somkiat@pui");
        given(messageRepository.findByName("somkiat"))
                .willReturn(Optional.of(somkiat));

        HelloResponse response =
                restTemplate.getForObject("/hello/somkiat",
                        HelloResponse.class);
        assertEquals("Hello somkiat", response.getMessage());
    }

    @Test
    public void sayHi2() {
        Message somkiat = new Message();
        somkiat.setName("demo");
        somkiat.setEmail("somkiat@pui");
        given(messageRepository.findByName("demo"))
                .willReturn(Optional.of(somkiat));

        HelloResponse response =
                restTemplate.getForObject("/hello/demo",
                        HelloResponse.class);
        assertEquals("Hello demo", response.getMessage());
    }
}