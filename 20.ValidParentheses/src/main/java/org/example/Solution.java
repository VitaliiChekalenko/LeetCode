package org.example;

import java.util.Map;
import java.util.Stack;

class Solution {
    private final Map<Character, Character> brackets = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (brackets.containsValue(charAt)) {
                stack.push(charAt);
            } else if (brackets.containsKey(charAt)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(charAt)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}