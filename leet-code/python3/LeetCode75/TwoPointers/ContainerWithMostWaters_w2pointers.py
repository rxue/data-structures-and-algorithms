class Solution:
    def maxArea(self, height: list[int]) -> int:
        max = 0
        leftIdx = 0
        rightIdx = len(height)-1
        while leftIdx < rightIdx:
            currentArea=(rightIdx - leftIdx)*min(height[leftIdx], height[rightIdx])
            if currentArea > max:
                max = currentArea
            if height[leftIdx] > height[rightIdx]:
                rightIdx = rightIdx -1
            else:
                leftIdx = leftIdx + 1
        return max
    
def main():
    s = Solution()
    nums = [1,8,6,2,5,4,8,3,7]
    print(s.maxArea(nums))


if __name__ == "__main__":
    main() 