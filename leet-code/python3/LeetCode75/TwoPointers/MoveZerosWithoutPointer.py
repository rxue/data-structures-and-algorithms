class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        nonZeros = []
        zeros = []
        for e in nums:
            if e == 0:
                zeros.append(e)
            else:
                nonZeros.append(e)
        i = 0
        for e in nonZeros + zeros:
            nums[i] = e
            i = i + 1

def main():
    s = Solution()
    nums = [0,0,1]
    s.moveZeroes(nums)
    print(nums)
if __name__ == "__main__":
    main()