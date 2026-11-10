class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        max = 0
        for i in range(0, len(s)):
            currentString = s[i:]
            currentVowels = self._countVowel(currentString, k)
            if max < currentVowels:
                max = currentVowels
        return max

    def _countVowel(self, s:str, k:int) -> int:
        counter = 0
        i = 0
        for c in s:
            if i < k and c in 'aeiou':
                counter = counter + 1
            elif i == k:
                break
            i = i + 1
        return counter
    

def main():
    s = Solution()
    nums = 'aeiou'
    print(s.maxVowels(nums, 2))


if __name__ == "__main__":
    main() 