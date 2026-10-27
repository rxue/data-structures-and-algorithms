package medium;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultHead = new ListNode();
        ListNode currentResultNode = resultHead;
        ListNode upper = l1;
        ListNode lower = l2;
        int carry = 0;
        while (upper != null || lower != null) {
            int upperVal = upper == null ? 0 : upper.val;
            int lowerVal = lower == null ? 0 : lower.val;
            int currenctSum = upperVal + lowerVal + carry;
            if (currenctSum >= 10) {
                currentResultNode.val = currenctSum - 10;
                carry = 1;
            } else {
                currentResultNode.val = currenctSum;
                carry = 0;
            }
            if ((upper != null && upper.next != null) || (lower != null && lower.next != null)) {
                currentResultNode.next = new ListNode();
                currentResultNode = currentResultNode.next;
            }
            if (upper != null)
                upper = upper.next;
            if (lower != null)
                lower = lower.next;
        }
        if (carry == 1) {
            currentResultNode.next = new ListNode(1);
        }
        return resultHead;
    }
}
