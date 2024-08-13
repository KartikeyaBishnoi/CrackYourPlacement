    void rearrangeEvenOdd(Node head)
    {
        //  The task is to complete this method
        Node evenHead = new Node(0);
        Node oddHead = new Node(0);
        Node even = evenHead;
        Node odd = oddHead;
        int index = 1;
        
        while(head != null)
        {
            if(index % 2 == 0)
            {
                even.next = head;
                even = even.next;
            }
            else
            {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            index++;
        }
        
        even.next = null;

        odd.next = evenHead.next;

        head = oddHead.next;
    }
    
}
