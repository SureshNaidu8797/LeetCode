class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int start = 0, elementInWindow = 0;
        long ans = 0;
        for (int num : nums) {
            if (num == max)
                elementInWindow++;

            while (elementInWindow == k) {
                if (nums[start] == max)
                    elementInWindow--;
                start++;
            }
        ans += start;
        }
        return ans;
    }
}