class Solution:
    def reverseWords(self, s: str) -> str:
        result = []
        for w in s.split():
            result.insert(0, w)
        return ' '.join(result)
    
def main():
    sol = Solution()
    inp = "hello world"
    print(sol.reverseWords(inp))

if __name__ == "__main__":
    main()