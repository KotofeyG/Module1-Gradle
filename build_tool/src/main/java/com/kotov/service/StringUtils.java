package com.kotov.service;

import com.kotov.exception.NumberException;
import com.kotov.util.NumberValidator;

import static org.apache.commons.lang3.StringUtils.*;

public class StringUtils {
    private static final String MINUS = "-";

    public static boolean isPositiveNumber(String str) throws NumberException {
        boolean result;

        if (NumberValidator.isNumber(str)) {
           result = !startsWith(str, MINUS);
        } else {
            throw new NumberException("The argument is not a number");
        }

        return result;
    }
}