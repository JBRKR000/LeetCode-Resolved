package org.ltcd.RansomNote;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 */


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magArray = magazine.toCharArray();
        boolean[] used = new boolean[magArray.length];
        int i = 0;
        while (i < ransomNote.length()) {
            boolean found = false;
            for (int j = 0; j < magArray.length; j++) {
                if (!used[j] && ransomNote.charAt(i) == magArray[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().canConstruct("ax", "abc"));
    }
}
