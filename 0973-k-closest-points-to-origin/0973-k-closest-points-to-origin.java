class Solution {
    private int distance (int [] point){
        return point[0]*point[0] + point[1]*point[1];
    }
    public int[][] kClosest(int[][] points, int k) {
        //create max heap
        PriorityQueue <int[] > pq = new PriorityQueue<>((a,b)->distance(b)-distance(a));

        //traverse all points
        for(int[] p : points){
            pq.add(p);
            if(pq.size()>k){//remove far point
               pq.poll();
               //men=ans points with max diatance gets remove
            }
        }
        //store points
        int [][] ans = new int[k][2];//k points and 2 , x y corrdinates
        for(int i=0 ;i<k ; i++){
            ans[i] = pq.poll();
        }
        return ans;
    }
}