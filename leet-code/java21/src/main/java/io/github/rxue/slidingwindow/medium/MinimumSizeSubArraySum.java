package io.github.rxue.slidingwindow.medium;

import java.util.LinkedList;

public class MinimumSizeSubArraySum {
    /**
     *
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen_myOwn(int target, int[] nums) {
        int minSize = 0, leftIdx = 0, rightIdx = 0;
        LinkedList<Integer> window = new LinkedList<>();
        int windowSum = 0;
        boolean isRightOver = false;
        while(!isRightOver || (leftIdx <= rightIdx && windowSum >= target)) {
            if (!isRightOver && window.stream().mapToInt(Integer::intValue).sum() < target) {
                window.add(nums[rightIdx]);
                windowSum += nums[rightIdx];
                isRightOver = ++rightIdx == nums.length;
            } else {
                minSize = minSize == 0 ? window.size() : Math.min(minSize, window.size());
                windowSum -= window.removeFirst();
                leftIdx++;
            }
        }
        return minSize;
    }
    /**
     *
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = 0, leftIdx = 0, rightIdx = 0;
        int windowSum = 0, windowSize = 0;
        for (; rightIdx < nums.length; rightIdx++) {
            windowSum += nums[rightIdx];
            windowSize++;
            while(windowSum >= target) {
                minSize = Math.min(minSize == 0 ? Integer.MAX_VALUE : minSize, windowSize);
                windowSum -= nums[leftIdx++];
                windowSize--;
            }
        }
        return minSize;
    }
}
