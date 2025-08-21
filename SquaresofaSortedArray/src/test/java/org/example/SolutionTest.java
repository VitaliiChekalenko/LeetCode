package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSorted() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{0,1,9,16,100}, solution.sortedSquares(new int[]{-4,-1,0,3,10}));
    }

}