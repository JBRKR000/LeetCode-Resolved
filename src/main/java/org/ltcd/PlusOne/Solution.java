package org.ltcd.PlusOne;
/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length- 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {digits[i]+=1; break;}
        }
        int cnt = 0;
        for (int digit : digits) {
            if (digit == 0) cnt++;
        }
        if(cnt == digits.length) {
            int[] newDigit = new int[digits.length+1];
            newDigit[0] = 1;
            return newDigit;
        }
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{9})));
    }
}
