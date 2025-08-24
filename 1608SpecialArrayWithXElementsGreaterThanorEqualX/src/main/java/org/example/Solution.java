package org.example;

class Solution {
    public int specialArray(int[] nums) {
        int counter = 0, length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] >= length) {
                counter++;
            }
        }

        return counter > length ? counter : -1;

    }
}