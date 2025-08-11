package org.example;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < map.size(); i++) {
            nums[i] = map.values().iterator().next();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return map.keySet().size();
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }
}
