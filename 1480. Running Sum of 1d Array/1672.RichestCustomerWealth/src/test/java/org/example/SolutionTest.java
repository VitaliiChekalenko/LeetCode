package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testSingleCustomer() {
        Solution solution = new Solution();
        int[][] accounts = {{1, 2, 3}};
        int expected = 6;
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void testMultipleCustomers() {
        Solution solution = new Solution();
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 1}
        };
        int expected = 10; // 4 + 5 + 1 = 10
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void testZeroWealthCustomers() {
        Solution solution = new Solution();
        int[][] accounts = {
                {0, 0, 0},
                {0, 0, 0}
        };
        int expected = 0;
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void testNegativeValues() {
        Solution solution = new Solution();
        int[][] accounts = {
                {-1, -2, -3},
                {0, -1, -2}
        };
        int expected = -3; // max of -6 and -3
        assertEquals(expected, solution.maximumWealth(accounts));
    }

    @Test
    void testOneEmptyAccount() {
        Solution solution = new Solution();
        int[][] accounts = {
                {},
                {1, 2, 3}
        };
        int expected = 6;
        assertEquals(expected, solution.maximumWealth(accounts));
    }
}