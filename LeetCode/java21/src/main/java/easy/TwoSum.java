package easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int firstIdx = 0; firstIdx < nums.length; firstIdx++) {
            for (int secondIdx = firstIdx+1; secondIdx < nums.length; secondIdx++) {
                if (nums[firstIdx] + nums[secondIdx] == target)
                    return new int[]{firstIdx,secondIdx};
            }
        }
        throw new UnsupportedOperationException();
    }
}
