package io.github.rxue.intervals.easy;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return List.of();
        int intervalStart = nums[0];
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i-1] + 1 < nums[i]) {
                if (intervalStart == nums[i-1]) result.add(intervalStart + "");
                else result.add(intervalStart + "->" + nums[i-1]);
                intervalStart = nums[i];
            }
        }
        if (intervalStart == nums[nums.length-1]) result.add(intervalStart + "");
        else result.add(intervalStart + "->" + nums[nums.length-1]);
        return result;
    }
}
