package org.ltcd.RemoveDuplicatesEASY;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class Solution {
    public int removeDuplicates(int[] nums) {
        AtomicInteger num = new AtomicInteger(0);
        int[] distinct_nums = Arrays.stream(nums).distinct().peek(e->num.incrementAndGet()).toArray();
        System.arraycopy(distinct_nums, 0, nums, 0, distinct_nums.length);
        return num.get();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Solution().removeDuplicates(nums));
    }
}
