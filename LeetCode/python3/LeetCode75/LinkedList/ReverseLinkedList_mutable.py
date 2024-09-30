from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
'''
Key point of the solution:
 - operation is on the same linked list
 - value of each element in linked list is never change
 - only pointer of each element in linked list is changed
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        newNext = None
        while current != None:
            nextPointer = current.next
            current.next = newNext
            newNext = current
            current = nextPointer
        return newNext

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