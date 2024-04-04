class Solution {
    public int maxDepth(String s) {
        int count=0,maxCount=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
                if(maxCount<count)
                    maxCount=count;
            }
            else if(c==')')
            count--;
        }
        System.gc();
        return maxCount;
    }
}