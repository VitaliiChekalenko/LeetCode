package org.example;

class Solution {
    public int maximumCount(int[] nums) {
        int negCounter = 0, posCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negCounter++;
            }
            if (nums[i] > 0) {
                posCounter++;
            }
        }

        return Math.max(posCounter, negCounter);
    }
}