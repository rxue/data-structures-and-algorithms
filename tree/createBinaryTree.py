from collections import deque
# Definition for a binary tree node.
from treenode import TreeNode
class TreeGenerator:
    def __init_(self):
        pass
    def generateBinaryTree(self, nums:list[int]) -> TreeNode:
        root = None
        incompleteNodeQueue = deque() # nodes without left or right child, i.e. complete node has both left and right child
        currentNode = None
        for n in nums:
            if n != None:
                currentNode = TreeNode(n, False, False)
            else:
                currentNode = None
            if root == None:
                root = currentNode
            self._addTo(currentNode, incompleteNodeQueue)

        for e in incompleteNodeQueue:
            if type(e.left) == bool:
                e.left = None
            if type(e.right) == bool:
                e.right = None
        return root
        
    def _addTo(self, newNode:TreeNode, incompletNodeQueue:deque[TreeNode]):
        if newNode != None:
            incompletNodeQueue.append(newNode)
        currentNode = incompletNodeQueue[0]
        if currentNode != newNode:
            if type(currentNode.left) == bool:
                currentNode.left = newNode
            elif type(currentNode.right) == bool:
                currentNode.right = newNode

        if type(currentNode.left) != bool and type(currentNode.right) != bool:
            incompletNodeQueue.popleft()

def main():
    g = TreeGenerator()
    nums = [3,5,1,6,2,9,8,None, None,7,4]
    root = g.generateBinaryTree(nums)
    print(root)


if __name__ == "__main__":
    main()

