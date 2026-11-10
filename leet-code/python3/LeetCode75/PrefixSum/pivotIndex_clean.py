class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        leftSum = 0
        rightSum = sum(nums)
        for i in range(0, len(nums)):
            if i > 0:
                leftSum = leftSum + nums[i-1]
            rightSum = rightSum - nums[i]
            if leftSum == rightSum:
                return i
        return -1
    
def main():
    s = Solution()
    nums = [1,2,3]
    print(s.pivotIndex(nums))


if __name__ == "__main__":
    main()