class Solution {
    public int findSum(int[] nums, int div){
        int sum =0;
        for(int n: nums){
            sum+= Math.ceil((double)n/div);
        }
        return sum;
    }
    public int binarySearch(int[]nums, int threshold, int low, int high){

        while(low<= high){
            int mid  = (low+high)/2;
            if(findSum(nums, mid)>threshold){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int n: nums){            
            if(n>max){
                max=n;
            }
        }
        return binarySearch(nums, threshold, 1, max);
    }
}