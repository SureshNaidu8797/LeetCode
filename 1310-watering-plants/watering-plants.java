class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int c=capacity;
        for(int i=0;i<plants.length;i++){
            if(c>=plants[i]){
                c=c-plants[i];
                count++;
            }
            else{
                count=count+i+i+1;
                c=capacity-plants[i];
            }
        }
        System.gc();
        return count;
    }
}