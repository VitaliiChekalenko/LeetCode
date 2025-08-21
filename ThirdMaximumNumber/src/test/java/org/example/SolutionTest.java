package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMethod() {
        Solution solution = new Solution();

        assertEquals(1, solution.thirdMax(new int[]{3,2,1}));
    }
}