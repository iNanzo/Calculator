package com.github.iNanzo.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }


    @Test
    @DisplayName("Test for Addition")
    void testAdd() {
        assertEquals(3, calculator.add(1, 2), "1 + 2 = ");
        assertEquals(-2, calculator.add(-4, 2), "-4 + 2");
    }

    @Test
    @DisplayName("Test for Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "4 - 2");
        assertEquals(4, calculator.subtract(5, 1), "5 - 1");
    }

    @Test
    @DisplayName("Test for Division")
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3");
        assertEquals(5, calculator.divide(5, 1), "5 / 1");
    }

    @Test
    @DisplayName("Divide by zero = ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
