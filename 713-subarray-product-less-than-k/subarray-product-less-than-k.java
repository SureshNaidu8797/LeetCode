class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0)
        return 0;
        int left=0,sum=1,result=0;
        for(int right=0;right<nums.length;right++){
            sum*=nums[right];
            while(sum>=k && left <=right){
                sum/=nums[left];
                left++;
            }
            result+=right-left+1;
        }
        System.gc();
        return result;
    }
}