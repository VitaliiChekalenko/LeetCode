package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testAmount() {
        Solution solution = new Solution();

        assertEquals(2, solution.findNumbers(new int[] {12,345,2,6,7896}));
    }
}