class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
    int ans=numBottles;
    while(numBottles>=numExchange){
        int refillBottle=numBottles/numExchange;
        ans+=refillBottle;
        int emptyBottle=numBottles%numExchange;
        numBottles=refillBottle+emptyBottle;
    }
    return ans;
    }
}