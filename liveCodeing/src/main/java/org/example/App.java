package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */

//int[] nums = {2, 4, 3, 3, 1};
//int target = 6;


public class App 
{
    public static void main( String[] args )   {
        int[] nums = new int[]{2, 4, 3, 3, 1};
        System.out.println(getUniqPares(6, nums));
    }

    private static Set<List<Integer>> getUniqPares(int target, int[] array) {

        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> seen = new HashSet<>();

        for (int x : array) {
            int y = target - x;
            if (seen.contains(y)) {
                int a = Math.max(x, y), b = Math.min(x, y);
                res.add(Arrays.asList(a, b));
            }
            seen.add(x);
        }
        return res;

//        Map<Integer, Integer> result = new HashMap<>();
//
//        int pointer = 0;
//
//        while (pointer < array.length - 1) {
//            for (int i = pointer + 1; i < array.length; i++) {
//                if (array[pointer] + array[i] == target) {
//                    if (array[pointer] < array[i]) {
//                        result.put(array[pointer], array[i]);
//
//                    } else {
//                        result.put(array[i], array[pointer]);
//
//                    }
//                }
//            }
//
//            pointer++;
//        }
//
//        return result;
    }
}
