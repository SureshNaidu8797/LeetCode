class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
    long res = 0;
    int badIdx = -1;
    int leftIdx = -1;
    int rightIdx = -1;
    for (int i = 0; i < nums.length; ++i) {
    if (nums[i] < minK || nums[i] > maxK) 
        badIdx = i;
    leftIdx = nums[i] == minK ? i: leftIdx;
    rightIdx =nums[i] == maxK ? i: rightIdx;
    res += Math.max(0, Math.min(leftIdx, rightIdx) - badIdx);
    }
    return res;
}
}