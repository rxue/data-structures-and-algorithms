package io.github.rxue.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void merge_example1() {
        int[][] input = {{1, 3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
    @Test
    void merge_example2() {
        int[][] input = {{1, 4},{4,5}};
        int[][] expected = {{1,5}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
    @Test
    void merge_example3() {
        int[][] input = {{4,7},{1, 4}};
        int[][] expected = {{1,7}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
    @Test
    void merge_example4() {
        int[][] input = {{1, 4},{5,6}};
        int[][] expected = {{1,4},{5,6}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
    @Test
    void merge_example5() {
        int[][] input = {{1, 4},{2,3}};
        int[][] expected = {{1,4}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
    @Test
    void merge_example6() {
        int[][] input = {{1, 4},{0,2},{3,5}};
        int[][] expected = {{0,5}};
        assertArrayEquals(expected, new Solution().merge(input));
    }
}
