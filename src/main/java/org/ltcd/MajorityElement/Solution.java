package org.ltcd.MajorityElement;

/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */


import java.util.Arrays;

public class Solution {
    public static int majorityElement(int[] nums) {
        int h = 0;
        int n = nums.length/2;
        nums = Arrays.stream(nums).sorted().toArray();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i]==nums[i+1]){
                h++;
                if(h==n){
                    return nums[i];
                }
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{5}));
    }
}
