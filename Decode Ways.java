class Solution
{
    public int numDecodings(String s)
    {
        if(s.charAt(0) == '0')
            return 0;

        int dp[] = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=s.length(); ++i)
        {
            char ch = s.charAt(i-1);
            if(ch>'0' && ch<='9')
                dp[i] = dp[i-1];
            
            int twoDigit = (s.charAt(i-2)-'0')*10 + (ch-'0');
            if(twoDigit>=10 && twoDigit<27)
                dp[i] += dp[i-2];
            
            if(dp[i] == 0)
                break;
        }
        return dp[s.length()];
        
    }
}
