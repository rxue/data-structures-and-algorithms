class Solution:
    def maxArea(self, height: list[int]) -> int:
        max = 0
        for x in range(0, len(height)):
            for x2 in range(x+1, len(height)):
                currentArea=(x2-x)*min(height[x2], height[x])
                if currentArea > max:
                    max = currentArea
        return max
    
def main():
    s = Solution()
    nums = [1,8,6,2,5,4,8,3,7]
    print(s.maxArea(nums))


if __name__ == "__main__":
    main() 