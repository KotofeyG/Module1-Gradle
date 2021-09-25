package com.kotov.util;

import static org.apache.commons.lang3.StringUtils.*;

public class NumberValidator {
    private static final String MINUS = "-";

    public static boolean isNumber(String str) {
        boolean result = str != null;
        if (result) {
            if (startsWith(str, MINUS)) {
                result = isNumeric(substring(str, MINUS.length()));
            } else {
                result = isNumeric(str);
            }
        }
        return result;
    }
}