/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        if(head == null)
            return false;
        ListNode hare = head.next;
        ListNode tortoise = head;

        while(hare != null && hare.next!=null )
        {
            hare = hare.next.next;
            tortoise = tortoise.next;
            if(hare == tortoise)
            {
                return true;
            }
            
        }
        return false;       
    }
}
