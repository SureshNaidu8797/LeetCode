class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length,j=0,res=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                map.put(nums[j],map.get(nums[j])-1);
                j++;
            }
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}