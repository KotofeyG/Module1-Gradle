package com.kotov.main;

import com.kotov.exception.NumberException;
import com.kotov.service.Utils;

public class Main {
    public static void main(String[] args) {
        boolean result = false;
        try {
            result = Utils.isAllPositiveNumbers("12", "79");
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
}