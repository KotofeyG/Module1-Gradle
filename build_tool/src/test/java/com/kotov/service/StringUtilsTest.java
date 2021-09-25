package com.kotov.service;

import com.kotov.exception.NumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumberWithPositiveResult() throws NumberException {
        String positiveNumber = "123";
        boolean condition = StringUtils.isPositiveNumber(positiveNumber);
        assertTrue(condition);
    }

    @Test
    void isPositiveNumberWithNegativeResult() throws NumberException {
        String positiveNumber = "-123";
        boolean condition = StringUtils.isPositiveNumber(positiveNumber);
        assertFalse(condition);
    }

    @Test
    void isPositiveNumberWithWrongArgument() {
        String wrongArgument = "-123b";
        try {
            StringUtils.isPositiveNumber(wrongArgument);
            fail("Method isPositiveNumber should throw NumberException");
        } catch (NumberException e) {
            assertTrue(true);
        }
    }

    @Test
    void isPositiveNumberWithNull() {
        String nullArgument = null;
        try {
            StringUtils.isPositiveNumber(nullArgument);
            fail("Method isPositiveNumber should throw NumberException");
        } catch (NumberException e) {
            assertTrue(true);
        }
    }
}