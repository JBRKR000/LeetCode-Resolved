package org.ltcd.HappyNumber;

import javax.xml.transform.Result;
import java.util.Arrays;

/*
Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
Example 1:
Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
Example 2:
Input: n = 2
Output: false
 */
public class Solution {
    public boolean isHappy(int n) {
        int iteration = 0;
        int result = 0;
        while(n!=1){
            String number = String.valueOf(n);
            int[] tableOfNumbers = new int[number.length()];
            for(int i = 0; i < number.length(); i++){
                tableOfNumbers[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            }
            for (int _number : tableOfNumbers) {
                result += (_number * _number);
            }
            n = result;
            result = 0;
            iteration++;
            if(iteration == 100)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isHappy(2));
    }
}
