class Solution
{
    public int maxProduct(int[] nums)
    {
        int len = nums.length;
        int leftProduct = 1;
        int rightProduct =1;
        int maxSoFar = nums[0];

        for(int i=0, j=len-1; i<len && j>=0; ++i,--j)
        {
            if(leftProduct == 0)
                leftProduct = 1;
            if(rightProduct == 0)
                rightProduct = 1;

            leftProduct *= nums[i];
            rightProduct *= nums[j];
            maxSoFar = Math.max(maxSoFar,Math.max(leftProduct, rightProduct));

            
        }
        return maxSoFar;
    }
}
