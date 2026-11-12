package io.github.rxue.arraystring.easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int[] original = Arrays.copyOf(nums, nums.length);
        int i = 0, previous = Integer.MIN_VALUE;
        for (int current : original) {
            if (current != previous)
                nums[i++] = current;
            previous = current;
        }
        final int uniqueNumber = i;
        for (; i < original.length; i++) nums[i] = 0;
        return uniqueNumber;
    }
}
