package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testM() {
        Solution solution = new Solution();

        assertArrayEquals(new int[] {0, 0}, solution.searchRange(new int[] {1,3}, 1));
        assertArrayEquals(new int[] {3 ,4}, solution.searchRange(new int[] {5,7,7,8,8,10}, 8));
    }

}