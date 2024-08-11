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
            return null;

        ListNode newHead = new ListNode();
        ListNode current = newHead;
        ListNode temp = head;

        int duplicate = Integer.MIN_VALUE;

        while(temp.next  != null)
        {
            if(temp.val != temp.next.val && duplicate != temp.val)
            {
                current.next = temp;
                current = current.next;
            }
            else
            {
                duplicate = temp.val;
            }
            temp = temp.next;
        }

        if(temp.val != duplicate)
        {
            current.next = temp;
            current = current.next;            
        }
        current.next = null;

        return newHead.next;
        
    }
}
