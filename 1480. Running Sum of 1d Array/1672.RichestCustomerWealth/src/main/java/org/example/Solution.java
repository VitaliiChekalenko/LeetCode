package org.example;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int reachest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];

            }
            reachest = Math.max(reachest, temp);
        }
        return reachest;
    }
}