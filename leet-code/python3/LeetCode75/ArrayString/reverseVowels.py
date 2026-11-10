class Solution:
    def reverseVowels(self, s: str) -> str:
        vowelSet = ('a','e','i','o','u')
        foundVowels = []
        for c in s:
            if c in vowelSet:
                foundVowels.append(c)
        result = []
        for c in s:
            if c in vowelSet:
                result.append(foundVowels.pop())
            else:
                result.append(c)
        return result.join('')