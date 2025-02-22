package org.ltcd.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s and t, return true if t is an 
anagram
 of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapping = new HashMap<>();
        Map<Character, Integer> mapping2 = new HashMap<>();
        loop(s, mapping);
        loop(t, mapping2);
        return mapping.equals(mapping2);
    }
    public void loop(String t, Map<Character, Integer> mapping2) {
        for (int i = 0; i < t.length(); i++) {
            if(!mapping2.containsKey(t.charAt(i))){
                mapping2.put(t.charAt(i), 1);
            }else {
                mapping2.put(t.charAt(i),mapping2.get(t.charAt(i))+1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram", "angaram"));
    }
}
