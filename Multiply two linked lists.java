class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long a=0;
        long m = 1000000007;

        while(first != null)
        {
            a = (a*10)%m + first.data;
            first = first.next;
        }
        
        long b = 0;
        while(second!=null)
        {
            b = (b*10)%m + second.data;
            second = second.next;
        }
        
        return (a*b)%m;
    }
    
}
