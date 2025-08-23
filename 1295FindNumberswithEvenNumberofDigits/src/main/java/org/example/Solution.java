package org.example;

class Solution {
    public int findNumbers(int[] nums) {
        int resCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            int circleCounter = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                circleCounter++;
            }
            if (circleCounter % 2 == 0) {
                resCounter++;
            }
        }
        return resCounter;
    }
}