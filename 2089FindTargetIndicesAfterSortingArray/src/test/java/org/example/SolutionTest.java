package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals(List.of(1,2), solution.targetIndices(new int[] {1,2,5,2,3}, 3));
        assertEquals(List.of(1,2), solution.targetIndices(new int[] {1,2,5,2,3}, 2));
    }

}