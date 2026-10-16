package com.example.cicd_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloControllerTest {

    @Test
    void helloReturnsGreeting() {
        String result = new HelloController().hello();
        assertTrue(result.startsWith("Hello, GitHub Actions!"));
    }
}