package com.dzone.albanoj2.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdderTest {
    
    private Adder adder;
    
    @BeforeEach
    public void setUp() {
        adder = new Adder();
    }

    @Test
    public void givenBothZero_whenAdd_thenValueCorrect() {
        assertEquals(0, adder.add(0, 0));
    }

    @Test
    public void givenBothPositive_whenAdd_thenValueCorrect() {
        assertEquals(2, adder.add(1, 1));
    }

    @Test
    public void givenBothNegative_whenAdd_thenValueCorrect() {
        assertEquals(-2, adder.add(-1, -1));
    }

    @Test
    public void givenAPositiveBZero_whenAdd_thenValueCorrect() {
        assertEquals(1, adder.add(1, 0));
    }

    @Test
    public void givenAZeroBPositive_whenAdd_thenValueCorrect() {
        assertEquals(1, adder.add(0, 1));
    }

    @Test
    public void givenANegativeBZero_whenAdd_thenValueCorrect() {
        assertEquals(-1, adder.add(-1, 0));
    }

    @Test
    public void givenAZeroBNegative_whenAdd_thenValueCorrect() {
        assertEquals(-1, adder.add(0, -1));
    }

    @Test
    public void givenANegativeBPositive_whenAdd_thenValueCorrect() {
        assertEquals(0, adder.add(-1, 1));
    }

    @Test
    public void givenAPositiveBNegative_whenAdd_thenValueCorrect() {
        assertEquals(0, adder.add(1, -1));
    }
}
