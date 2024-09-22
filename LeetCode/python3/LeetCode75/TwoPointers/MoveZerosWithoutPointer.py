class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        lastIdx = len(nums)-1
        i = 0
        while i < len(nums):
            if i < lastIdx and nums[i] == 0:
                for m in range(i, lastIdx):
                    nums[m] = nums[m+1]
                nums[lastIdx]  = 0
                lastIdx = lastIdx - 1
            else:
                i = i + 1

def main():
    s = Solution()
    nums = [0,0,1]
    s.moveZeroes(nums)
    print(nums)
if __name__ == "__main__":
    main()