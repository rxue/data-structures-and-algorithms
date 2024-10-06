import sys
class Solution:
    def countBits(self, n: int) -> list[int]:
        result = []
        result.append(0)
        for c in range(1,n+1):
            current1s = [1 for b in bin(c) if b == '1'] 
            result.append(sum(current1s))
        return result

def main():
    print(type(sys.maxsize))
    result = bin(2)
    print(result[1])
    s = Solution()
    print(s.countBits(4))
    print(s.countBits(5))


if __name__ == "__main__":
    main()