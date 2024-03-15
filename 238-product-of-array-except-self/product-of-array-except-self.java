class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     int prevprod=1,nextprod=1;
        //     for(int prev=0;prev<i;prev++)
        //         prevprod*=nums[prev];
        //     for(int next=i+1;next<nums.length;next++)
        //         nextprod*=nums[next];
        //     ans[i]=nextprod*prevprod;
        // }
        // return ans;
        int pfprod=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=pfprod;
            pfprod*=nums[i];
        }
        int sfprod=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=sfprod;
            sfprod*=nums[i];
        }
        return ans;
    }
}