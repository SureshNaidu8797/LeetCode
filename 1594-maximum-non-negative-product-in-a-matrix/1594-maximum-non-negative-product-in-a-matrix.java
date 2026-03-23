class Solution {
    public int maxProductPath(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        long MOD=1000000007;
        long[][] maxArray=new long[m][n];
        long[][] minArray=new long[m][n];
        maxArray[0][0]=minArray[0][0]=grid[0][0];
        for(int i=1;i<n;i++)
        maxArray[0][i]=minArray[0][i]=maxArray[0][i-1]*grid[0][i];
        for(int i=1;i<m;i++)
        maxArray[i][0]=minArray[i][0]=maxArray[i-1][0]*grid[i][0];
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                long curr=grid[i][j];
                long a=maxArray[i-1][j]*curr;
                long b=maxArray[i][j-1]*curr;
                long c=minArray[i-1][j]*curr;
                long d=minArray[i][j-1]*curr;
                maxArray[i][j]=Math.max(Math.max(a,c),Math.max(b,d));
                minArray[i][j]=Math.min(Math.min(a,c),Math.min(b,d));
            }
        }
        long ans=maxArray[m-1][n-1];
        if (ans < 0)
        return -1;
        return (int)(ans % MOD);
        
    }
}