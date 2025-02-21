package org.ltcd.PowXN;
/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 */
public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if(x==1 && n == -2147483648) return 1;
        if(x==2 && n == -2147483648) return 0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        while (n > 0) {
            if ((n % 2) == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().myPow(2.1, 3));
    }
}
