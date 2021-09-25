package com.kotov.service;

import com.kotov.exception.NumberException;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) throws NumberException {
        boolean result = true;
        if (str != null) {
            for (String numbers : str) {
                if (!StringUtils.isPositiveNumber(numbers)) {
                    result = false;
                }
            }
        } else {
            throw new NumberException("The argument is null");
        }
        return result;
    }
}