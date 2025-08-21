package org.example;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;
        int right = needle.length();


        while (right <= haystack.length()) {
            String substring = haystack.substring(right - needle.length(), right);
            if (substring.equals(needle)) {
                return right - needle.length();
            }
            right++;
        }
        return -1;
    }
}