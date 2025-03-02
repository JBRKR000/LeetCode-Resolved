package org.ltcd.ReverseInteger;

public class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(-2147483648));
    }
}
