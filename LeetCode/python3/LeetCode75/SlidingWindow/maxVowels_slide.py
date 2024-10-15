class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        maxV = self._countVowels(s[:min(k, len(s))])
        VOWELS = "aeiou"
        currentVowels = maxV
        if len(s) > k:
            for i in range(k, len(s)):
                if s[i] in VOWELS:
                    if s[i-k] not in VOWELS:
                        currentVowels = currentVowels + 1
                elif s[i-k] in VOWELS: 
                        currentVowels = currentVowels - 1
                maxV = max(currentVowels, maxV)
        return maxV
    def _countVowels(self, s:str) -> int:
        counter = 0
        for c in s:
            if c in "aeiou":
                counter = counter + 1
        return counter

    

def main():
    s = Solution()
    nums = "abciiidef"
    print(s.maxVowels(nums, 3))
    nums = "aeiou"
    print(s.maxVowels(nums, 2))
    nums = "leetcode"
    print(s.maxVowels(nums, 3))
    nums = "a"
    print(s.maxVowels(nums, 1))

if __name__ == "__main__":
    main() 