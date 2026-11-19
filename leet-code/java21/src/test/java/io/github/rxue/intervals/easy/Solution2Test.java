package io.github.rxue.intervals.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {
    @Test
    void summaryRanges_example1() {
        Solution2 s = new Solution2();
        assertEquals(List.of("0->2","4->5","7"), s.summaryRanges(new int[]{0,1,2,4,5,7}));
    }
    @Test
    void summaryRanges_example2() {
        Solution2 s = new Solution2();
        assertEquals(List.of("0","2->4","6","8->9"), s.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
    @Test
    void summaryRanges_empty() {
        Solution2 s = new Solution2();
        assertEquals(List.of(), s.summaryRanges(new int[]{}));
    }
    @Test
    void summaryRanges_with_negative() {
        Solution2 s = new Solution2();
        assertEquals(List.of("-2147483648","0","2->4"), s.summaryRanges(new int[]{-2147483648, 0,2,3,4}));
    }
}
