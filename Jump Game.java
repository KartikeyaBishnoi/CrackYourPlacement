class Solution
{
    public boolean canJump(int[] nums)
    {
        if(nums.length == 1)
            return true;
        boolean dp[] = new boolean[nums.length];
        
        
        for(int i=0; i<nums.length; ++i)
        {
            if(dp[nums.length-1] == true)
                return true;
            if(i!=0 && dp[i] == false)
                return false;
            for(int j=i+1; j<nums.length && j<=i+nums[i] ; ++j)
            {
                
                dp[j] = true;
            }
        }
        return dp[nums.length-1];
        
    }
}
