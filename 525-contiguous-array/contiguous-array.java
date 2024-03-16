class Solution {
    public int findMaxLength(int[] nums) {
        int s=0,maxCount=0;
        HashMap<Integer,Integer> freq=new HashMap<>();
        freq.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                s-=1;
            else
                s+=1;
            if(freq.containsKey(s))
                maxCount=Math.max(maxCount,i-freq.get(s));
            else
                freq.put(s,i);
        }
        return maxCount;
    }
}