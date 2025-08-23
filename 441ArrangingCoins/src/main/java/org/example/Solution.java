package org.example;

class Solution {
    public int arrangeCoins(int n) {
        int counter = 1, temp = n;

        while (temp >= counter) {
            temp = temp - counter;
            counter++;
        }

        return temp < 0 ? counter - 2 : counter -1;
    }
}