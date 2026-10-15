package com.example.cicd_demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {

  @Test
  void helloReturnsGreeting() {
    String result = new HelloController().hello();
    assertTrue(result.startsWith("Hello, GitHub Actions!"));
  }

}
