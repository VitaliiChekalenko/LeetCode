package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testPos() {
        Solution solution = new Solution();

        assertEquals(3, solution.specialArray(new int[] {0,4,3,0,4}));
    }
}