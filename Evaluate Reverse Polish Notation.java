class Solution
{
    public int evalRPN(String[] tokens)
    {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens)
        {
            if (isOperator(str))
            {
                int a = stack.pop();
                int b = stack.pop();
                switch (str)
                {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
            else 
            {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String str)
    {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
