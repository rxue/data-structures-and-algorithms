package io.github.rxue.intervals.easy;

import java.util.ArrayList;
import java.util.List;

public class StandardSolution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return List.of();
        int start = nums[0];
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (i == nums.length || nums[i-1] + 1 < nums[i]) {
                if (start == nums[i-1]) result.add(start + "");
                else result.add(start + "->" + nums[i-1]);
                if (i < nums.length)
                    start = nums[i];
            }
        }
        return result;
    }
}
