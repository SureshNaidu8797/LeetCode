class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for(int x:nums){
            int xCount = hm.getOrDefault(x,0);
            ans+=xCount;
            hm.put(x,xCount+1);
        }
        return ans;
    }
}