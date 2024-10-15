from typing import Tuple
class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        max = 0
        i = 0
        while i < len(s):
            if s[i] in 'aeiou':
                i, vowels = self._vowelsTill(s, i)
                if vowels > max:
                    max = vowels
            i = i + 1
        return min(max, k)
    
    '''
        return first int - first index of non-vowel
        return second int - amount of serial vowels
    '''
    def _vowelsTill(self, s:str, startIdx:str) -> Tuple[int, int]:
        counter = 0
        for i in range(startIdx, len(s)):
            if s[i] in 'aeiou':
                counter = counter + 1
            else:
                break
        return i, counter
    

def main():
    s = Solution()
    nums = "abciiidef"
    print(s.maxVowels(nums, 3))


if __name__ == "__main__":
    main() 