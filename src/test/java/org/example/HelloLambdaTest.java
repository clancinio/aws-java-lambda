package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloLambdaTest {

  final HelloLambda helloLambda = new HelloLambda();

  @Test
  void shouldReturnHelloMessage() {
    final String name = "Bob";
    assertEquals("Hello, Bob! Welcome to AWS Lambda.", helloLambda.handleRequest(name));
  }

}
