package org.example;

class Solution {
    public int lengthOfLastWord(String s) {
        boolean first = false;
        int counter = 0;
        final char space = ' ';

        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (first && s.charAt(i) == space) {
                break;
            }
            if (!first && s.charAt(i) != space) {
                first = true;
            }
            if (s.charAt(i) != space) {
                counter++;
            }
        }
       return counter;
    }
}