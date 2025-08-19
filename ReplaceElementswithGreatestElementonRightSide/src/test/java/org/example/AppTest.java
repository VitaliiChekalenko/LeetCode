package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Test
    void testGreat() {
        App app = new App();

        assertArrayEquals(new int[] {18,6,6,6,1,-1}, app.replaceElements(new int[] {17,18,5,4,6,1}));
    }
}