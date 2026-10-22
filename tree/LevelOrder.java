import java.util.*;

class LevelOrder{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    static void levelOrder(Node root){
        if(root==null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            if(curr.left!=null){
                queue.offer(curr.left);
            }
            if(curr.right!=null){
                queue.offer(curr.right);
            }
            
            ans.add(curr.data);
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        levelOrder(root);

    }
}