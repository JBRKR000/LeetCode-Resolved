package org.ltcd.RemoveDuplicatesMEDIUM;
/*
Given an integer array nums sorted in non-decreasing order,
remove some duplicates in-place such that each unique element appears at most twice.
The relative order of the elements should be kept the same.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


POLISH:
Każdy element w tablicy nums powinien występować maksymalnie 2 razy.
Zwróć długość tablicy nums po usunięciu duplikatów.
Zachowaj względny porządek elementów.
 */

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]==nums[i-1]){
                if(count < 2){
                    nums[j++] = nums[i];
                }
                count++;
            }else{
                count = 1;
                nums[j++] = nums[i];
            }
        }
            return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3,3,3};
        System.out.println(removeDuplicates(nums));
    }
}