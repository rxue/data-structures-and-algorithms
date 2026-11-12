package io.github.rxue.arraystring.medium;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int[] original = Arrays.copyOf(nums, nums.length);
        int i = 0, previous = Integer.MIN_VALUE, duplicateCounter = 0;
        for (int current : original) {
            if (current != previous) {
                nums[i++] = current;
                duplicateCounter = 1;
            } else {
                if (duplicateCounter == 1) nums[i++] = current;
                duplicateCounter++;

            }
            previous = current;
        }
        final int uniqueNumber = i;
        for (; i < original.length; i++) nums[i] = 0;
        return uniqueNumber;
    }
}
