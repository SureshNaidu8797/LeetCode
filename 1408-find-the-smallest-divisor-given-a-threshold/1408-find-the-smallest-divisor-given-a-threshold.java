class Solution {
    static int validSome(int num, int nums[])
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]+num-1)/num;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
        int high=0;
        int low=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>high) high=nums[i];
        }
        int ans=0;
        while(low<=high)
        {
            int mid=(2*low+high-low)/2;
            int resultSum=validSome(mid, nums);
            if(resultSum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}