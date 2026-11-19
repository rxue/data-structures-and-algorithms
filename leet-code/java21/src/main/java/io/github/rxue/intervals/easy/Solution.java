package io.github.rxue.intervals.easy;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int index = 0;
        List<String> result = new ArrayList<>();
        while(index < nums.length) {
            var indexToFoundSerial = getCurrentSeries(index, nums);
            result.add(indexToFoundSerial.getValue());
            index = indexToFoundSerial.getKey();
        }
        return result;
    }
    private static Map.Entry<Integer,String> getCurrentSeries(int startIndex, int[] nums) {
        int serial, originalNumberIndex, previousSameNum = nums[startIndex];
        for (serial = nums[startIndex], originalNumberIndex = startIndex;
             originalNumberIndex < nums.length && serial == nums[originalNumberIndex];
             serial++, originalNumberIndex++) {
            previousSameNum = serial;
        }
        String serialValue;
        if (nums[startIndex] < previousSameNum) {
            serialValue = nums[startIndex] + "->" + previousSameNum;
        } else {
            serialValue = nums[startIndex] + "";
        }
        return new AbstractMap.SimpleEntry<>(originalNumberIndex, serialValue);
    }
}
