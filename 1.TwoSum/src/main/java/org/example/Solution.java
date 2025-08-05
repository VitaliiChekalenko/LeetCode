package org.example;

//  https://leetcode.com/problems/two-sum/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            int key = target - cur;
            if (hashMap.containsKey(key)) {
                return new int[]{hashMap.get(key), i};
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}