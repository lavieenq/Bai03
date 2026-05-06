package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private final App app = new App();

    @Test
    void testMultiply() {
        assertEquals(6, app.multiply(2, 3));
    }
}