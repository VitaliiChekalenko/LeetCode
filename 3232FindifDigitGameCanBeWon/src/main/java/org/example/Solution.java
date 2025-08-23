package org.example;

class Solution {
    public boolean canAliceWin(int[] nums) {
        int oneDigitCounter = 0, twoDigitsCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9) {
                twoDigitsCounter = twoDigitsCounter + nums[i];
            } else {
                oneDigitCounter = oneDigitCounter + nums[i];
            }
        }
        return oneDigitCounter != twoDigitsCounter;
    }
}