package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SolutionTest {

    @Test
    void testMaxCount() {
        Solution solution = new Solution();

        assertEquals(1, solution.maximumCount(new int[] {-1}));
        assertEquals(3, solution.maximumCount(new int[] {-2,-2,-1}));
        assertEquals(3, solution.maximumCount(new int[] {-2,-1,-1,1,2,3}));
    }

}