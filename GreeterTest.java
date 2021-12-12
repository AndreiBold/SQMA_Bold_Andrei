package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {
    @Test
    public void should_say_hello() {
        Greeter greeter = new Greeter("John Doe");

        String greeting = greeter.sayHello();

        assertThat(greeting).isEqualTo("Hello, John Doe!");
    }
}
