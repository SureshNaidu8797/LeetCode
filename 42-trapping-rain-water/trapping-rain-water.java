class Solution {
    public int trap(int[] height){
        int n=height.length,i;
        int minarr[]=new int[n];
        int maxarr[]=new int[n];
        minarr[0]=height[0];
        maxarr[n-1]=height[n-1];
        for( i=1;i<n;i++)
            minarr[i]=Math.max(minarr[i-1],height[i]);
        
        for( i=n-2;i>=0;i--)
            maxarr[i]=Math.max(maxarr[i+1],height[i]);
        
        int trappedWater=0;
        for( i=0;i<n;i++)
            trappedWater=trappedWater+(Math.min(minarr[i],maxarr[i])-height[i]);
        
         return trappedWater;
    }
}