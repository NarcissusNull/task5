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
        Random random = new Random();
        int multiple = random.nextInt(40);
        String result = fizzBuzz.fizzBuzz(3 * multiple);

        assertEquals("Fizz", result);
    }
}
