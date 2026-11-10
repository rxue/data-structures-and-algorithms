class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        idx = 0
        if len(s) > len(t):
            return False
        for c in s:
            resultIdx = self.indexOf(c, t[idx:])
            if resultIdx != -1:
                idx = idx + resultIdx + 1
            else:
                return False
        return True
    def indexOf(self, c:chr, givenString: str) -> int:
        for i in range(0, len(givenString)):
            if givenString[i] == c:
                return i
        return -1 
    
def main():
    sol = Solution()
    print(sol.isSubsequence("abc","ahbgdc"))
    print(sol.isSubsequence("axc","ahbgdc"))
    print(sol.isSubsequence("aaaaaa","bbaaaa"))

if __name__ == "__main__":
    main()
