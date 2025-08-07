package org.example;

//https://leetcode.com/problems/roman-to-integer/description/

import java.util.Map;

class Solution {
    private final Map<Character, Integer> values = Map.of(
            'I' ,         1,
            'V' ,         5,
            'X' ,         10,
            'L' ,         50,
            'C' ,         100,
            'D' ,         500,
            'M' ,         1000);


    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = values.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? values.get(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }
}