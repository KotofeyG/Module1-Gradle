package com.kotov.service;

import com.kotov.exception.NumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbersWithPositiveResult() throws NumberException {
        String[] numbers = {"1", "10", "25", "100", "9999"};
        boolean condition = Utils.isAllPositiveNumbers(numbers);
        assertTrue(condition);
    }

    @Test
    void isAllPositiveNumbersWithNegativeResult() throws NumberException {
        String[] numbers = {"1", "10", "-25", "100", "9999"};
        boolean condition = Utils.isAllPositiveNumbers(numbers);
        assertFalse(condition);
    }

    @Test
    void isPositiveNumbersWithWrongArgument() {
        String[] numbers = {"1", "10", "-25", "100b", "9999"};
        try {
            Utils.isAllPositiveNumbers(numbers);
            fail("Method isPositiveNumbers should throw NumberException");
        } catch (NumberException e) {
            assertTrue(true);
        }
    }

    @Test
    void isPositiveNumbersWithNull() {
        String[] numbers = null;
        try {
            Utils.isAllPositiveNumbers(numbers);
            fail("Method isPositiveNumbers should throw NumberException");
        } catch (NumberException e) {
            assertTrue(true);
        }
    }
}