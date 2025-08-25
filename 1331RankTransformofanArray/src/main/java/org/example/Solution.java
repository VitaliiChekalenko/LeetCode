package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> res = new HashMap<>();

        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();

        for (int i = 0; i < sorted.length; i++) {
            res.put(sorted[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(arr[i]);
        }

        return arr;
    }
}