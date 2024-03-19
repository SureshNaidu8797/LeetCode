class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0)
        return tasks.length;
        int[] freq = new int[26];
        int max = 0;
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        int numOfElementsWithMaxFreq = 0;
        for (int frequency : freq) {
            if (frequency > max) {
                max=frequency;
                numOfElementsWithMaxFreq=1;
            }
            else if(frequency==max)
            numOfElementsWithMaxFreq++;
        }
        return Math.max((n + 1) * (max - 1) + numOfElementsWithMaxFreq, tasks.length);
    }
}