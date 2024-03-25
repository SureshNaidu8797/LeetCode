class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            if(nums[num-1]<0)
            list.add(num);
            nums[num-1]*=-1;
        }
        return list;
    }
}