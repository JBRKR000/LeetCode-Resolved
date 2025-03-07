package org.ltcd.SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int i = 0;
        if(nums.length == 1){
            if(nums[0] == target)return 0;
            if(nums[0] > target)return 0;
            return 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)return mid;
            if(nums[mid] < target){
                start = mid +1;
            }else {end = mid -1;}
        }
        return start;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1}, 2));
    }
}
