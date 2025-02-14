package org.ltcd.ValidPalindrome;
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s);
        String firstHalf = s.substring(0, s.length()/2);
        String secondHalf = s.substring(s.length()/2);
        char[] frst = firstHalf.toCharArray();
        char[] scnd = secondHalf.toCharArray();
        int j = scnd.length - 1 ;
        for (char c : frst) {
            if (c != scnd[j]) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome("a@ba"));
    }
}
