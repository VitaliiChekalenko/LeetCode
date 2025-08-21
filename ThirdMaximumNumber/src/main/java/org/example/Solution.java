package org.example;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);
        int second = nums[nums.length - 1], third = second;

        for (int i = nums.length - 2; i >= 0 ; i--) {
            if (second == third && nums[i] < third) {
                second = nums[i];
                continue;
            }
            if (second < third && nums[i] < second) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}