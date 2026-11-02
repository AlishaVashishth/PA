// GFG
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // Queue: to store nodes
        // Visited Array: to store visited nodes
        Queue<Integer> queue = new LinkedList<>();
        int v = adj.size();
        boolean[] visited = new boolean[v];
        
        ArrayList<Integer> res = new ArrayList<>();
        
        visited[0] = true;
        queue.add(0);
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int n:adj.get(node)){
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
        
        return res;
    }
}