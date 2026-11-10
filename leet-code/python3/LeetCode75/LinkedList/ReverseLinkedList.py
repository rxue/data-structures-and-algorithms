from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head != None:
            current = head
            stack = []
            while current != None:
                stack.append(current.val)
                current = current.next
            reversedHead = None
            reversedPrev = None
            while len(stack) > 0: 
                currentNode = ListNode(stack.pop())
                if reversedPrev != None:
                    reversedPrev.next = currentNode
                if reversedHead == None:
                    reversedHead = currentNode
                reversedPrev = currentNode
            return reversedHead
        return None

def main():
    s = Solution()
    e3rd = ListNode(3)
    e2nd = ListNode(2, e3rd)
    head = ListNode(1, e2nd)
    result = s.reverseList(head)
    print("result %d" % result.val)
    re2nd = result.next
    print("result next value %d" % re2nd.val)
    print("result next value %d" % re2nd.next)
if __name__ == "__main__":
    main()