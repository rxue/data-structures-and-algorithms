from typing import List
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        altitudes = []
        altitudes.append(0)
        i = 0
        for g in gain:
            altitudes.append(altitudes[i] + g)
            i = i + 1

        return max(altitudes)

def main():
    sol = Solution()
    inp = [-4,-3,-2,-1,4,3,2]
    print(sol.largestAltitude(inp))

if __name__ == "__main__":
    main()
