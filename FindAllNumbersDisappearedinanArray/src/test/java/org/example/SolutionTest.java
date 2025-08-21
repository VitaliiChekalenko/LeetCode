package org.example;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals(Collections.singletonList(new int[]{5, 6}), solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}