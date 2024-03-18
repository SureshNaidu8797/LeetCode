class Solution {
    public int findMinArrowShots(int[][] points) {
        int Arrows=1;
        Arrays.sort(points,Comparator.comparingInt(point -> point[0]));
        int right=points[0][1];
        for(int i=0;i<points.length;i++){
            int ithleft=points[i][0];
            int ithright=points[i][1];
            if(right<ithleft){
                Arrows++;
                right=ithright;
            }
            else{
                right=Math.min(right,ithright);
            }
        }
        return Arrows;
    }
}