package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) return false;

            Map<Character, Integer> ransonMap = new HashMap<>();
            Map<Character, Integer> magazineMap = new HashMap<>();

            getMap(ransomNote, ransonMap);
            getMap(magazine, magazineMap);

            AtomicBoolean res = new AtomicBoolean(true);

            ransonMap.keySet().forEach(character -> {
                if (magazineMap.get(character) == null && magazineMap.get(character) < ransonMap.get(character)) {
                    res.set(false);
                }
            });

            return true;
        }

    private void getMap(String ransomNote, Map<Character, Integer> ransonMap) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char charAt = ransomNote.charAt(i);
            if (!ransonMap.containsKey(charAt)) {
                ransonMap.put(charAt, 1);
            } else {
                ransonMap.put(charAt, ransonMap.get(charAt) + 1);
            }
        }
    }
}