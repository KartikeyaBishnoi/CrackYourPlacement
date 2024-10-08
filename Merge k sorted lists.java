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
    public ListNode mergeKLists(ListNode[] lists)
    {
        if( lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        ListNode ans = lists[0];

        for(int i=1; i<lists.length; ++i)
        {
            ans = merge(ans, lists[i]);
        }
        return ans;
        
    }
    public ListNode merge(ListNode head1, ListNode head2)
    {
        ListNode newHead = new ListNode();
        ListNode current = newHead;

        while(head1 != null && head2 != null)
        {
            if(head1.val <= head2.val)
            {
                current.next = head1;
                head1 = head1.next;
            }
            else
            {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        while(head1 != null)
        {
            current.next = head1;
            head1 = head1.next;
            current = current.next;
        }
        while(head2 != null)
        {
            current.next = head2;
            head2 = head2.next;  
            current = current.next;          
        }
        return newHead.next;
        
    }
}
