package org.example;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int less= 0, same = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) less++;
            if (nums[i] == target) same++;
        }

        while (same > 0) {
            res.add(less++);
            same--;
        }

        return res;
    }
}