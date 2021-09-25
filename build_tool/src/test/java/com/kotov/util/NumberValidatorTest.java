package com.kotov.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberValidatorTest {

    @Test
    void isNumberWithPositiveNumber() {
        String positiveNumber = "123";
        boolean condition = NumberValidator.isNumber(positiveNumber);
        assertTrue(condition);
    }

    @Test
    void isNumberWithNegativeNumber() {
        String negativeNumber = "-123";
        boolean condition = NumberValidator.isNumber(negativeNumber);
        assertTrue(condition);
    }

    @Test
    void isNumberWithWrongArgument() {
        String wrongArgument = "-123b";
        boolean condition = NumberValidator.isNumber(wrongArgument);
        assertFalse(condition);
    }

    @Test
    void isNumberWithNull() {
        String nullArgument = null;
        boolean condition = NumberValidator.isNumber(nullArgument);
        assertFalse(condition);
    }
}