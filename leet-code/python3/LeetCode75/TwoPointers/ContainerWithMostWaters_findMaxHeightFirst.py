from typing import Tuple
class Solution:
    def maxArea(self, height: list[int]) -> int:
        max1Idx, max2Idx = self._find2MaxHeights(height)
        max = None
        for left in range(0, max1Idx+1):
            for right in range(max2Idx, len(height)):
                currentArea=(right-left)*min(height[right], height[left])
                if max is None:
                    max = currentArea
                elif currentArea > max:
                    max = currentArea
        return max
    def _find2MaxHeights(self, heights: list[int]) -> Tuple[int, int]:
        max1Idx = None
        for i in range(0,len(heights)):
            if max1Idx == None:
                max1Idx = i
            else:
                if heights[i] > heights[max1Idx]:
                    max1Idx = i
        max2Idx = None
        for i in range(0,len(heights)):
            if i != max1Idx:
                if max2Idx == None:
                    max2Idx = i
                else:
                    if heights[i] > heights[max2Idx]:
                        max2Idx = i
        if max1Idx > max2Idx:
            return max2Idx, max1Idx
        else:
            return max1Idx, max2Idx     
    
def main():
    s = Solution()
    nums = [1,8,6,2,5,4,8,3,7]
    print(s.maxArea(nums))


if __name__ == "__main__":
    main() 