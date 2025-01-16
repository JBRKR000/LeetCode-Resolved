package org.ltcd.MergeSortedArray;

import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = Stream.concat(Arrays.stream(nums1, 0, m).boxed(), Arrays.stream(nums2, 0, n).boxed())
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
        System.arraycopy(result, 0, nums1, 0, result.length);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int n = 3;
        int[] nums2 = {2, 5, 6};
        merge(nums1, m, nums2, n);
    }
}