class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<S.length(); ++i)
        {
            char ch = S.charAt(i);
            if(Character.isDigit(ch))
            {
                stack.push(Integer.parseInt(ch+""));
            }
            else
            {
                int b = stack.pop();
                int a = stack.pop();
                if(ch == '+')
                    stack.push(a+b);
                else if(ch == '-')
                    stack.push(a-b);
                else if(ch == '*')
                    stack.push(a*b);
                else 
                    stack.push(a/b);
            }
        }
        return stack.pop();
    }
}
