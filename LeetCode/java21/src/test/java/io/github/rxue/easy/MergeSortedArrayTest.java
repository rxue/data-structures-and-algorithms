package io.github.rxue.easy;

import easy.MergeSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortedArrayTest {
    @Test
    public void base() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertTrue(Arrays.equals(new int[]{1,2,2,3,5,6}, nums1));
    }
    @Test
    public void base2() {
        int[] nums1 = {4,5,6,0,0,0};
        int m = 3;
        int[] nums2 = {1,2,3};
        int n = 3;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        assertTrue(Arrays.equals(new int[]{1,2,3,4,5,6}, nums1));
    }
}
