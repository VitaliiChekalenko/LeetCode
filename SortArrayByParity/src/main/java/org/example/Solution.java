package org.example;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int pointer = 0;
        int[] result = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                result[pointer] = num;
                pointer++;
            }
        }

        for (int num : nums) {
            if (num % 2 == 1) {
                result[pointer] = num;
                pointer++;
            }
        }

        return result;

    }
}