package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testp() {
        Solution solution = new Solution();

        assertTrue(solution.validMountainArray(new int[]{0,3,2,1}));
    }

 @Test
    void testp2() {
        Solution solution = new Solution();

        assertFalse(solution.validMountainArray(new int[]{2,1}));
    }
    @Test
    void testp3() {
        Solution solution = new Solution();

        assertFalse(solution.validMountainArray(new int[]{3,5,5}));
    }

}