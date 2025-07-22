package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testRunningSumBasicCase() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};

        int[] result = solution.runningSum(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testRunningSumSingleElement() {
        Solution solution = new Solution();
        int[] input = {5};
        int[] expected = {5};

        int[] result = solution.runningSum(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testRunningSumWithZeros() {
        Solution solution = new Solution();
        int[] input = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};

        int[] result = solution.runningSum(input);
        assertArrayEquals(expected, result);
    }

    @Test
    void testRunningSumWithNegatives() {
        Solution solution = new Solution();
        int[] input = {1, -1, 3, -3};
        int[] expected = {1, 0, 3, 0};

        int[] result = solution.runningSum(input);
        assertArrayEquals(expected, result);
    }
}