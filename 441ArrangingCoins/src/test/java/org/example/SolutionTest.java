package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals(1, solution.arrangeCoins(1));
        assertEquals(2, solution.arrangeCoins(5));
    }

}