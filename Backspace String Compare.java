class Solution
{
    public boolean backspaceCompare(String s, String t)
    {
        return getText(s).equals(getText(t));
        
    }
    public String getText(String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); ++i)
        {
            char ch = str.charAt(i);

            if(ch == '#' && !stack.isEmpty())
                stack.pop();
            
            else if(ch != '#')
                stack.push(ch);
        }
        String res = "";
        while(!stack.isEmpty())
        {
            res = stack.pop() + res;
        }
        return res;
    }
}
