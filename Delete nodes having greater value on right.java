/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // your code here
        head = reverse(head);
        
        Node temp = head.next;
        Node current = head;
        
        while(temp != null)
        {
            if(temp.data >= current.data)
            {
                current.next = temp;
                current = current.next;
            }
            temp = temp.next;
        }
        current.next = null;
        
        head = reverse(head);
        return head;
    }
    Node reverse(Node head)
    {
        Node current = head;
        Node previous = null;
        Node currentNext = null;
        
        while(current != null)
        {
            currentNext = current.next;
            current.next = previous;
            previous = current;
            current = currentNext;
        }
        return previous;
    }
}
