package org.example;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += nums[i];

        long best = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            if (windowSum > best) best = windowSum;
        }
        return (double) best / k;
    }
}