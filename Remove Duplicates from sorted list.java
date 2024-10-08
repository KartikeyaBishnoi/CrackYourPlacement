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
class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
            return head;
        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null)
        {
            if(prev.val == curr.val)
            {
                curr = curr.next;
                prev.next = curr;
                continue;
            }
            if(curr != null)
                curr = curr.next;
            prev = prev.next;
        }
        return head;
        
    }
}
