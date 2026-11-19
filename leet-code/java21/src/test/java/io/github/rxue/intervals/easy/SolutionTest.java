package io.github.rxue.intervals.easy;

import io.github.rxue.intervals.easy.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void summaryRanges_example1() {
        Solution s = new Solution();
        assertEquals(List.of("0->2","4->5","7"), s.summaryRanges(new int[]{0,1,2,4,5,7}));
    }
    @Test
    void summaryRanges_example2() {
        Solution s = new Solution();
        assertEquals(List.of("0","2->4","6","8->9"), s.summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }
}
