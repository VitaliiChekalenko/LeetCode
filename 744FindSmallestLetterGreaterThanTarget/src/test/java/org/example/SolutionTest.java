package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals('f', solution.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
        assertEquals('x', solution.nextGreatestLetter(new char[]{'x','x','y','y'}, 'z'));
    }

}