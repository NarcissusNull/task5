package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_print_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(1);

        assertEquals("1", result);
    }
}
