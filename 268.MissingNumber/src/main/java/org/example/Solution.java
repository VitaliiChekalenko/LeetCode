package org.example;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) return 0;

        for (int i = 0, j = nums.length - 1; i < nums.length - 1 && j > i; i++, j--) {
            if (nums[i] + 1 != nums[i + 1]) {
                return nums[i] + 1;
            }
            if (nums[j] - 1!= nums[j - 1] ) {
                return nums[j] - 1;
            }
        }

        return nums[nums.length - 1] + 1;
    }
}