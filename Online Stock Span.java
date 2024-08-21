import java.util.*;

class StockSpanner
{
    Stack<int[]> stack;
    int index;
    public StockSpanner()
    {
        stack = new Stack<>();
        index = 0;
    }

    public int next(int price)
    {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[1] <= price) 
        {
            span += stack.pop()[0];
        }
        stack.push(new int[]{span, price});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
