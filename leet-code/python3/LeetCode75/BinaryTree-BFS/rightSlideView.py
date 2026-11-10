# Definition for a binary tree node.
from typing import Optional
from queue import Queue
import sys
sys.path.insert(0, '../../../tree')
from createBinaryTree import TreeGenerator
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> list[int]:
        queue = Queue()
        result = []
        if root is not None:
            queue.put((root, 0))
        prevLevel = None
        while queue.qsize() > 0:
            top = queue.get()
            topNode = top[0]
            topLevel = top[1]
            if prevLevel is None or prevLevel < topLevel:
                result.append(topNode.val)
            else:
                result[-1] = topNode.val
            if topNode.left is not None:
                queue.put((topNode.left, topLevel+1))
            if topNode.right is not None:
                queue.put((topNode.right, topLevel+1))
            prevLevel = topLevel
        return result

def main():
    s = Solution()
    nums = [1,2,3,None,5,None,4]
    gen = TreeGenerator()
    result = s.rightSideView(gen.generateBinaryTree(nums))
    print(result)


if __name__ == "__main__":
    main()