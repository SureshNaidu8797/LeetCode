class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0, n=plants.length ,cap=capacity;
        for(int i=0;i<n;i++){
            steps+=(plants[i]<=cap ? 0 : 2) *i+1;
            cap=(plants[i]<=cap ? cap : capacity) -plants[i];
        }
        return steps;
    }
}