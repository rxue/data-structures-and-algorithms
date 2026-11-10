import math
from statistics import mean

class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        maxSum = sum(nums[:k])
        added = sum(nums[:k])
        for i in range(0, len(nums)-k+1):
            if i > 0:
                added = added - nums[i-1] + nums[i+k-1]
            if added > maxSum:
                maxSum = added
        return maxSum/k

def main():
    s = Solution()
    nums = [1,12,-5,-6,50,3]
    print(s.findMaxAverage(nums, 4))
    nums = [5]
    print(s.findMaxAverage(nums, 1))
if __name__ == "__main__":
    main()