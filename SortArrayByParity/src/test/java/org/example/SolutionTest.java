package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSm() {
        Solution solution = new Solution();

        assertArrayEquals(new int[]{2,4,3,1}, solution.sortArrayByParity(new int[]{3,1,2,4}));
    }
}