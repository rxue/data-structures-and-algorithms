package io.github.rxue.intervals.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ImprovedSolutionTest {
    @Test
    void merge_example1() {
        int[][] input = {{1, 3},{2,6},{8,10},{15,18}};
        int[][] expected = {{1,6},{8,10},{15,18}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void merge_example2() {
        int[][] input = {{1, 4},{4,5}};
        int[][] expected = {{1,5}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void merge_example3() {
        int[][] input = {{4,7},{1, 4}};
        int[][] expected = {{1,7}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void merge_example4() {
        int[][] input = {{1, 4},{5,6}};
        int[][] expected = {{1,4},{5,6}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void merge_example5() {
        int[][] input = {{1, 4},{2,3}};
        int[][] expected = {{1,4}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void merge_example6() {
        int[][] input = {{1, 4},{0,2},{3,5}};
        int[][] expected = {{0,5}};
        assertArrayEquals(expected, new ImprovedSolution().merge(input));
    }
    @Test
    void insert_example1() {
        int[][] intervals = {{1, 3},{6,9}};
        int[] newInterval = {2,5};
        assertArrayEquals(new int[][]{{1,5},{6,9}}, new ImprovedSolution().insert(intervals, newInterval));
    }
    @Test
    void insert_example2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        assertArrayEquals(new int[][]{{1,2},{3,10},{12,16}}, new ImprovedSolution().insert(intervals, newInterval));
    }

    @Test
    void insert_empty_2nd_dim() {
        int[][] intervals = {};
        int[] newInterval = {5,7};
        assertArrayEquals(new int[][]{{5,7}}, new ImprovedSolution().insert(intervals, newInterval));
    }
    @Test
    void insert_one_interval() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {2,3};
        assertArrayEquals(new int[][]{{1,5}}, new ImprovedSolution().insert(intervals, newInterval));
    }
    @Test
    void insert_one_interval2() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {0,3};
        assertArrayEquals(new int[][]{{0,5}}, new ImprovedSolution().insert(intervals, newInterval));
    }
}
