package org.ltcd.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k,
and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // LIMITED TIME EXCEEDED :( FOR MY SOLUTION
        // I MADE IT IN A GOOD WAY BUT TOO SLOW FOR THE LEETCODE :D
//        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
//        for(int i = 0; i<nums.length - 2; i++){
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//            for (int j = i+1; j < nums.length - 1; j++) {
//                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
//                for (int k = j+1; k < nums.length; k++) {
//                    if(k > j + 1 && nums[k]==nums[k - 1])continue;
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                       list.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    }
//                }
//            }
//        }
//        return list;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
