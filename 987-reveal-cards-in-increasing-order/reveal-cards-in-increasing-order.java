class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int l=deck.length;
        int res[]=new int[l];
        Deque<Integer> Q =new LinkedList<>();
        for(int i=0;i<l;i++)
            Q.add(i);
        for (int card:deck){
            int i=Q.poll();
            res[i]=card;
            if(!Q.isEmpty())
                Q.add(Q.poll());
        }
        return res;
    }
}