from typing import List
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        altitudes = []
        max = 0 
        altitudes.append(0)
        i = 0
        for g in gain:
            newAlt = altitudes[i] + g
            if max < newAlt:
                max = newAlt
            altitudes.append(newAlt)
            i = i + 1
        return max

def main():
    sol = Solution()
    inp = [-4,-3,-2,-1,4,3,2]
    print(sol.largestAltitude(inp))

if __name__ == "__main__":
    main()
