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
    public ListNode partition(ListNode head, int x)
    {
        ListNode newHead = new ListNode();
        ListNode newPartition = new ListNode();
        ListNode start = newHead;
        ListNode part = newPartition;
        ListNode current = head;

        while(current != null)
        {
            if(current.val < x)
            {
                start.next = current;
                start = start.next;
            }
            else
            {
                part.next = current;
                part = part.next;
            }
            current = current.next;
        }

        start.next = newPartition.next;
        part.next = null;
        return newHead.next;              
    }
}
