package org.example;

/*
* Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


Constraints:

1 <= n <= 104
* */

import java.util.LinkedList;
import java.util.List;

class Solution {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String FIZZBUZZ = "FizzBuzz";

    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();

        for (int i = 1; i < n + 1; i++) {
            result.add(getFizzOrBuzzString(i));
        }
        System.gc();
        return result;
    }

    private String getFizzOrBuzzString(int num) {
        return (num % 3 == 0 && num % 5 == 0) ? FIZZBUZZ : num % 3 == 0 ? FIZZ : num % 5 == 0 ? BUZZ : String.valueOf(num);
    }
}
