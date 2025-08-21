package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSM() {
        Solution solution = new Solution();

        assertEquals(2, solution.removeElement(new int[]{3,2,2,3}, 3));
    }

}