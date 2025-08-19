package org.example;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int n = arr.length;
        int counter = 0;

        while (counter + 1 < n && arr[counter] < arr[counter + 1]) {
            counter++;
        }

        if (counter == 0 || counter == n - 1) return false;

        while (counter + 1 < n && arr[counter] > arr[counter + 1]) {
            counter++;
        }

        return counter == n - 1;
    }
}