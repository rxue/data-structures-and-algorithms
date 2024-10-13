# Reference Tutorial: https://www.youtube.com/watch?v=fPnQWeFlBCU&t=456s
class Solution:
    def minCostClimbingStairs(self, cost: list[int]) -> int:
        minCost = []
        for i in range(0, len(cost)+1):
            if i <= 1:
                if len(cost) <= 1:
                    return 0
                minCost.append(0)
            else:
                minCost.append(min(minCost[i-2] + cost[i-2], minCost[i-1] + cost[i-1]))
        return minCost[-1]
    
def main():
    s = Solution()
    nums = [10,15,30]
    print(s.minCostClimbingStairs(nums))


if __name__ == "__main__":
    main()