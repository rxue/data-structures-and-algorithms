class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxNumber = max(candies)
        result = []
        for c in candies:
            result.append(c+extraCandies >= maxNumber)
        return result