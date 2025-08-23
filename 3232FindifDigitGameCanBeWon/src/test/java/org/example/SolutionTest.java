package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testGame() {
        Solution solution = new Solution();

        assertFalse(solution.canAliceWin(new int[]{1,2,3,4,10}));
        assertTrue(solution.canAliceWin(new int[]{1,2,3,4,5,14}));
        assertTrue(solution.canAliceWin(new int[]{5,5,5,25}));

    }
}