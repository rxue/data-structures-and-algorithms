class Solution:
    def tribonacci(self, n: int) -> int:
        i = 0
        mem = []
        while i < n:
            if i == 0:
                mem.append(0)
            elif i == 1:
                mem.append(1)
            elif i == 2:
                mem.append(1)
            else:
                mem.append(mem[i-1] + mem[i-2] + mem[i-3])
            i = i + 1
        if n == 0:
            return 1
        if n == 1:
            return 1
        if n == 2:
            return 1
        return mem[n-1] + mem[n-2] + mem[n-3]
    
def main():
    s = Solution()
    s.tribonacci(3)

if __name__ == "__main__":
    main()
              