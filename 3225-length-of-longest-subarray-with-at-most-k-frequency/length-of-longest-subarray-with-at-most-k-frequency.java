class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // int n=nums.length,j=0,res=0;
        // HashMap<Integer,Integer> map =new HashMap<>();
        // for (int i=0;i<n;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //     while(map.get(nums[i])>k){
        //         map.put(nums[j],map.get(nums[j])-1);
        //         j++;
        //     }
        //     res=Math.max(res,i-j+1);
        // }
        // return res;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] frequencies = new int[max - min + 1];
        int left = 0;
        int maxWindow = 0;
        for (int right = 0; right < nums.length; right++) {
            frequencies[nums[right] - min]++;
            while (frequencies[nums[right] - min] > k) {
                frequencies[nums[left] - min]--;
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        System.gc();
        return maxWindow;
    }
}