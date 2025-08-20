package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testAr() {
        Solution solution = new Solution();

        assertEquals(2, solution.removeDuplicates(new int[] {1,1,2}));
    }

}