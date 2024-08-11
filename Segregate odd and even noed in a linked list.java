/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head)
    {
        Node evenHead = new Node(0);
        Node oddHead = new Node(0);
        Node even = evenHead;
        Node odd = oddHead;
        Node current = head;
        
        while(current != null)
        {
            if(current.data % 2 == 0)
            {
                even.next = current;
                even = even.next;
            }
            else
            {
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
        }
        even.next = oddHead.next;
        odd.next = null;
        return evenHead.next;
        
    }
}
