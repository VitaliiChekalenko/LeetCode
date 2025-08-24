package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testMethod() {
        Solution solution = new Solution();

        assertEquals(2, solution.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2));
    }
}