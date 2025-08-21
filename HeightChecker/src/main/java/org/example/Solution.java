package org.example;

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = new int[heights.length];
        System.arraycopy(heights, 0,copy, 0, heights.length);
        Arrays.sort(heights);

        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}