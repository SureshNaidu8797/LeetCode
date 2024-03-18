class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        int k=0;
        for(int num:nums){
            if(num<0){
                k++;
                int v=(seen.size() < k) ? -1:seen.get(seen.size()-k);
                res.add(v);
            }else{
                seen.add(num);
                k=0;
            }
        }
        return res;
    }
}