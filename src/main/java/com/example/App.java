package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    public int multiply(int a, int b) {
        int result = a * b;
        log.info("Multiply {} * {} = {}", a, b, result);
        return result;
    }
}