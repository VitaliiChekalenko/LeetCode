package org.example;

//  https://leetcode.com/problems/fruits-into-baskets-ii/?envType=daily-question&envId=2025-08-05
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        int n = baskets.length;;
        for (int fruit: fruits) {
            int unset = 1;

            for (int i = 0; i < n; i++) {
                if (fruit <= baskets[i]) {
                    baskets[i] = 0;
                    unset = 0;
                    break;
                }
            }
            count += unset;
        }
        return count;
    }
}