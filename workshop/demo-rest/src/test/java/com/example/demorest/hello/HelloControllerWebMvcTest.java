package com.example.demorest.hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerWebMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private HelloService helloService;

    @Test
    public void sayHi() throws Exception {

        given(helloService.process("somkiat"))
                .willReturn("Hello somkiat");

        MvcResult result = mvc.perform(get("/hello/somkiat"))
                .andExpect(status().isOk())
                .andReturn();

        String json = result.getResponse().getContentAsString();
        ObjectMapper objectMapper = new ObjectMapper();
        HelloResponse response = objectMapper.readValue(json, HelloResponse.class);

        assertEquals("Hello somkiat", response.getMessage());
    }
}