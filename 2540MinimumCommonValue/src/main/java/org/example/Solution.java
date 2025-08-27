package org.example;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    return nums1[i];
//                }
//            }
//        }
//        return -1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                return nums2[i];
            }
        }

        return -1;
    }
}