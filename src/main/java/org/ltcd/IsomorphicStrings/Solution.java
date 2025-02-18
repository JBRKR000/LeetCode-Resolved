package org.ltcd.IsomorphicStrings;
/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "foo", t = "bar"
Output: false
Explanation:
The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:
Input: s = "paper", t = "title"
Output: true
 */

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder word = new StringBuilder();
        AtomicInteger x = new AtomicInteger();
        Set<Character> used = new HashSet<>();
        Map<Character,Character> map = new LinkedHashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), Character.MIN_VALUE);
        }
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            if (entry.getValue().equals(Character.MIN_VALUE)) {
                while (x.get() < t.length() && used.contains(t.charAt(x.get()))) {
                    x.getAndIncrement();
                }
                if (x.get() < t.length()) {
                    char newValue = t.charAt(x.getAndIncrement());
                    entry.setValue(newValue);
                    used.add(newValue);
                } else {
                    return false;
                }
            }
        }
        for(int i = 0; i < t.length();i++){
            word.append(map.get(s.charAt(i)));
        }
        return word.toString().equals(t);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
    }
}