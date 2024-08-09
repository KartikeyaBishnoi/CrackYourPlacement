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
    public int getDecimalValue(ListNode head)
    {
        //find the length of linked list

        ListNode temp = head;
        int size = 0;
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }

        int result = 0;
        temp = head;
        while(temp != null)
        {
            result += temp.val*Math.pow(2,--size);
            temp = temp.next;
        }
        return result;

        
    }
}
