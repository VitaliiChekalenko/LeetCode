package org.example;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        for (int x : nums) seen[x] = true;
        for (int i = 0; i <= n; i++) if (!seen[i]) return i;
        return -1;
    }
}