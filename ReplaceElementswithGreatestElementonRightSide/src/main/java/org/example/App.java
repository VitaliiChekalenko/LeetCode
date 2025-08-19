package org.example;

public class App {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int i = 0;
        while (i < arr.length - 1) {
            int great = 0;
            arr[i] = arr[i + 1];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > great) {
                    great = arr[j];
                }
            }
            arr[i + 1] = 0;
            arr[i] = great;
            i++;
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}
