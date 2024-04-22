class Solution {
    public int openLock(String[] deadends, String target) {
        HashSet<String> deadEnd = new HashSet<>(List.of(deadends));
        if (deadEnd.contains("0000"))
            return -1;

        Queue<Pair> q = new LinkedList<>();
        deadEnd.add("0000");
        q.add(new Pair("0000", 0));
        while (!q.isEmpty()) {
            Pair curr = q.remove();
            if (curr.str.equals(target)) {
                return curr.turn;
            }

            for (String child : generateNeighbors(curr.str)) {
                if (!deadEnd.contains(child)) {
                    deadEnd.add(child);
                    q.add(new Pair(child, curr.turn + 1));
                }
            }
        }
        return -1;
    }

    public List<String> generateNeighbors(String str) {
        List<String> neighbors = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            char[] chars = str.toCharArray();

            chars[i] = (char) ((chars[i] - '0' + 1) % 10 + '0');
            neighbors.add(new String(chars));

            chars[i] = (char) ((chars[i] - '0' - 2 + 10) % 10 + '0');
            neighbors.add(new String(chars));
        }

        return neighbors;
    }

    class Pair {
        String str;
        int turn;

        public Pair(String str, int turn) {
            this.str = str;
            this.turn = turn;
        }
    }
}
