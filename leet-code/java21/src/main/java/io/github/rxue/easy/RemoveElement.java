package io.github.rxue.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int[] numsBackup = Arrays.copyOf(nums, nums.length);
        int resultIndex = 0;
        for (int currentValue : numsBackup) {
            if (currentValue != val) {
                nums[resultIndex++] = currentValue;
            }
        }
        for (int i = resultIndex; i < nums.length; i++)
            nums[i] = 0;
        return resultIndex;
    }
}
