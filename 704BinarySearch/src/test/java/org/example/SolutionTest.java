package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void testBinarySearch() {
        Solution solution = new Solution();

        Assertions.assertEquals(4, solution.search(new int[] {-1,0,3,5,9,12}, 9));
    }

}