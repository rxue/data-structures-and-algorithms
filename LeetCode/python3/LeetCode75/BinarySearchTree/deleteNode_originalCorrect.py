import sys
sys.path.insert(0, '../../../tree')
from createBinaryTree import TreeGenerator

from typing import Optional
class TreeNode:
     def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        if root is None:
            return None
        predecessor, nodeToDelete = self._findWithPredecessor(None, root, key)
        if nodeToDelete is not None:
            if nodeToDelete.right is None:
                nodeToDelete.right = nodeToDelete.left
            else:
                self._putToLeftMost(nodeToDelete.left, nodeToDelete.right)
            if predecessor is not None:
                if predecessor.left == nodeToDelete:
                    predecessor.left = nodeToDelete.right
                elif predecessor.right == nodeToDelete:
                    predecessor.right = nodeToDelete.right
                
        if predecessor is None and nodeToDelete is not None: 
            if nodeToDelete.left is None and nodeToDelete.right is None:
                return None
            elif nodeToDelete.left is not None and nodeToDelete.right is None:
                return nodeToDelete.left
            else:
                return nodeToDelete.right
        return root
    def _putToLeftMost(self, node:TreeNode, target:TreeNode):
        current = target
        while current is not None and current.left is not None:
            current = current.left
        current.left = node            

    def _findWithPredecessor(self, predecessor:TreeNode, fromNode:TreeNode, val:int):
        if fromNode.val == val:
            return predecessor, fromNode
        elif fromNode.left == None and fromNode.right == None:
            return None, None
        elif fromNode.val > val and fromNode.left != None:
            return self._findWithPredecessor(fromNode, fromNode.left, val)
        elif fromNode.val < val and fromNode.right != None:
            return self._findWithPredecessor(fromNode, fromNode.right, val)
        

def main():
    s = Solution()
    gen = TreeGenerator()
    nums = [2,1]
    result = s.deleteNode(gen.generateBinaryTree(nums), 1)
    nums = [3,2,4,1]
    result = s.deleteNode(gen.generateBinaryTree(nums), 2)
    nums = [2,1]
    result = s.deleteNode(gen.generateBinaryTree(nums), 2)
    nums = [5,3,6,2,4,None,7]
    result = s.deleteNode(gen.generateBinaryTree(nums), 7)
    result = s.deleteNode(gen.generateBinaryTree(nums), 5)
    result = s.deleteNode(gen.generateBinaryTree(nums), 3)
    print(result)
    result = s.deleteNode(gen.generateBinaryTree(nums), 0)
    print(result)


if __name__ == "__main__":
    main()
        


                