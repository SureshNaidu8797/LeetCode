class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ticketToBuy=tickets[k];
        int seconds=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k)
                seconds+=Math.min(ticketToBuy,tickets[i]);
            else
                seconds+=Math.min(ticketToBuy-1,tickets[i]);
        }
        return seconds;
    }
}