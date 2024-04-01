class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        System.out.println(s);
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && len>0)
            return len;
            else
            len++;
        }
        return len;
    }
}