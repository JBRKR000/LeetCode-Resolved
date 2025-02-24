package org.ltcd.WordPattern;

import java.util.*;

/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".
 */
public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        Map<Character, String> mapping = new HashMap<>();
        String[] words2 = new String[words.length];
        if(pattern.length() != words.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if(!mapping.containsValue(words[i])){
                mapping.put(pattern.charAt(i), words[i]);
            }
        }
        for (int i = 0; i < pattern.length(); i++) {
            words2[i] = mapping.get(pattern.charAt(i));
        }
        return Arrays.equals(words2, words);
    }
    public static void main (String[]args){
        System.out.println(new Solution().wordPattern("abba", "dog cat cat dog")); //true
        System.out.println(new Solution().wordPattern("jquery", "jquery")); //false
        System.out.println(new Solution().wordPattern("aaaa", "dog cat cat dog")); // false
        System.out.println(new Solution().wordPattern("abba", "dog dog dog dog")); // false
        System.out.println(new Solution().wordPattern("a", "dog")); // true
    }
}
