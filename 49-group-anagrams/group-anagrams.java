class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for (String s :strs){
            char[] count = new char[26];
            for(char ch: s.toCharArray()){
                count[ch-'a']++;
            }
            String str=new String(count);
            if(!map.containsKey(str))
            map.put(str,new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}