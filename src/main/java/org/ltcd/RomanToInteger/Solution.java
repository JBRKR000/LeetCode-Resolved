package org.ltcd.RomanToInteger;

public class Solution {

    public int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int result = 0;
        char[] table = s.toCharArray();
        for (int i = 0; i < table.length; i++) {
            int getKey1 = getValue(table[i]);
            if (i + 1 < table.length) {
                int getKey2 = getValue(table[i + 1]);
                if (getKey1 >= getKey2) {
                    result += getKey1;
                } else {
                    result += (getKey2 - getKey1);
                    i++;
                }
            } else {
                result += getKey1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}