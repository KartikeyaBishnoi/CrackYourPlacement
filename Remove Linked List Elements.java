/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode();
        ListNode curr = newHead;

        while(head!= null)
        {
            if(head.val != val)
            {
                curr.next = head;
                head = head.next;
                curr = curr.next;
            }
            else
            {
                head = head.next;
            }
        }
        curr.next = null;
        return newHead.next;
        
    }
}
