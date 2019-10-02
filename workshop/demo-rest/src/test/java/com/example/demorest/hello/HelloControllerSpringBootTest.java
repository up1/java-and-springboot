package com.example.demorest.hello;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.springframework.boot.test.context.SpringBootTest.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HelloControllerSpringBootTest {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeClass
    public static void runOnceOnStart() {

    }

    @AfterClass
    public static void runOnceOnFinish() {

    }

    @Before
    public void initial() {
        Message somkiat = new Message();
        somkiat.setName("somkiat");
        somkiat.setEmail("somkiat@pui");

        Message demo = new Message();
        demo.setName("demo");
        demo.setEmail("somkiat@pui");

        messageRepository.save(somkiat);
        messageRepository.save(demo);
    }

    @After
    public void cleanup() {
        messageRepository.deleteAll();
    }

    @Test
    public void sayHi() {
        HelloResponse response =
                restTemplate.getForObject("/hello/somkiat",
                        HelloResponse.class);
        assertEquals("Hello somkiat", response.getMessage());
    }

    @Test
    public void sayHi2() {
        HelloResponse response =
                restTemplate.getForObject("/hello/demo",
                        HelloResponse.class);
        assertEquals("Hello demo", response.getMessage());
    }
}