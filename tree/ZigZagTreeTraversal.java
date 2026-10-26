/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/
import java.util.*;
class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean ltr = true;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node curr = queue.poll();
                l.add(curr.data);
                if(curr.left!=null) queue.add(curr.left);
                if(curr.right!=null) queue.add(curr.right);
            }
            if(!ltr){
                Collections.reverse(l);
            }
            list.addAll(l);
            ltr = !ltr;
        }
        
        return list;
    }
}