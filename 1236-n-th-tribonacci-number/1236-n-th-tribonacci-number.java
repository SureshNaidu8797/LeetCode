class Solution {
    public int tribonacci(int n) {
        int T0=0,T1=1,T2=1,sum=0;
        if(n==0)
        return 0;
        if(n==1||n==2)
        return 1;
        for(int i=3;i<=n;i++){
            sum=T0+T1+T2;
            T0=T1;
            T1=T2;
            T2=sum;
        }
        return sum;
    }
}