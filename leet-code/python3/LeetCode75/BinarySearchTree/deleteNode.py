import sys
sys.path.insert(0, '../../../tree')
from createBinaryTree import TreeGenerator

from typing import Optional
class TreeNode:
     def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def isLeaf(node:TreeNode) -> bool:
    return node.left is None and node.right is None

class Solution:
    def deleteNode(self, root: Optional[TreeNode], key: int) -> Optional[TreeNode]:
        predecessor, nodeToDelete = self._findWithPredecessor(None, root, key)
        if nodeToDelete is None:
            return root
        elif predecessor is not None:
            if isLeaf(nodeToDelete):
                if predecessor.left == nodeToDelete:
                    predecessor.left = None
                elif predecessor.right == nodeToDelete:
                    predecessor.right = None
                return root
            else:
                rightResult = self._putToLeftMost(nodeToDelete.left, nodeToDelete.right)
                if predecessor.left == nodeToDelete:
                    predecessor.left = rightResult
                    return root
                elif predecessor.right == nodeToDelete:
                    predecessor.right = rightResult
                    return root

    
        else: # no predecessor, i.e. found from the root
            result = self._putToLeftMost(nodeToDelete.left, nodeToDelete.right)
            return result
    
    def _putToLeftMost(self, node:TreeNode, target:TreeNode) -> TreeNode:
        current = target
        while current is not None and current.left is not None:
            current = current.left
        if current is not None:
            current.left = node 
        elif node is not None:
            target = node    
        return target       

    def _findWithPredecessor(self, predecessor:TreeNode, fromNode:TreeNode, val:int):
        if fromNode is None:
            return None, None
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
    nums = [4,None,7,6,8,5,None,None,9]
    result = s.deleteNode(gen.generateBinaryTree(nums), 7)
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
        


                