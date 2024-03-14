package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloWorldControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        HelloWorldController helloWorldController = new HelloWorldController();

        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController)
                .build();
    }


    @Test
    void returnsHelloWorld() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world!"));
    }
}