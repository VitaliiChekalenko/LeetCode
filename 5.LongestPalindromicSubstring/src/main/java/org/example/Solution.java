package org.example;

class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        if (isPalindrome(s)) return s;

        int right = 0, left = 1;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (isPalindrome(substring)) {
                    if (res.length() < substring.length()) {
                        res = substring;
                    }
                }
            }
        }

        return res;
    }

    private boolean isPalindrome(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}