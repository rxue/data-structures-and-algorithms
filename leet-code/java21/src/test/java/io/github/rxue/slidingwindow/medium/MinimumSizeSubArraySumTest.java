package io.github.rxue.slidingwindow.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumSizeSubArraySumTest {
    @Test
    void solution_exmaple1() {
        assertEquals(2, new MinimumSizeSubArraySum().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
    @Test
    void solution_exmaple2() {
        assertEquals(1, new MinimumSizeSubArraySum().minSubArrayLen(4, new int[]{1,4,4}));
    }
    @Test
    void solution_exmaple3() {
        assertEquals(0, new MinimumSizeSubArraySum().minSubArrayLen(11, new int[]{1,1,1}));
    }
    @Test
    void solution_4() {
        assertEquals(3, new MinimumSizeSubArraySum().minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}
