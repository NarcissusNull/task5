package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_print_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(1);

        assertEquals("1", result);
    }

    @Test
    void should_print_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(48);

        assertEquals("Fizz", result);
    }

    @Test
    void should_print_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.fizzBuzz(10);

        assertEquals("Buzz", result);
    }
}
