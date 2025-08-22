package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int j : nums1) {
            seen.add(j);
        }

        for (int j : nums2) {
            if (seen.contains(j)) {
                res.add(j);
            }
        }

        int i = 0;
        int[] result = new int[res.size()];
        for (int x : res) {
            result[i] = x;
            i++;
        }

        return result;
    }
}