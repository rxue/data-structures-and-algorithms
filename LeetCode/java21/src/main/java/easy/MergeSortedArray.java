package easy;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] originalArray = Arrays.copyOf(nums1, m);
        int i1 = 0;
        int i2 = 0;
        int copyIndex = 0;
        while (i1 < m || i2 < n) {
            if (i1 < m && i2 < n) {
                if (originalArray[i1] <= nums2[i2]) {
                    nums1[copyIndex++] = originalArray[i1++];
                } else {
                    nums1[copyIndex++] = nums2[i2++];
                }
            } else if (i1 < m) {
                nums1[copyIndex++] = originalArray[i1++];
            } else if (i2 < n) {
                nums1[copyIndex++] = nums2[i2++];
            }
        }

    }

}
