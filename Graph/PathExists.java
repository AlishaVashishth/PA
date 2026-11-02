//GFG

class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean[] visit = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visit[src]=true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(node==dest){
                return true;
            }
            for(int n:adj.get(node)){
                if(!visit[n]){
                    visit[n]=true;
                    queue.add(n);
                }
            }
        }
        return false;
    }
}
