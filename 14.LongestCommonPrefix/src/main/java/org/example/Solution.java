package org.example;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/longest-common-prefix/submissions/1728121448/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int pointer = 0;

        while (pointer < strs[0].length()) {
            for (int i = 1; i < strs.length; i++) {
                if (strs[0].charAt(pointer) != strs[i].charAt(pointer)) {
                    return strs[0].substring(0, pointer);
                }
            }
            pointer++;
        }
        return strs[0].substring(0, pointer);
    }
}