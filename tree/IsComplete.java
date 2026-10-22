import java.util.*;

class IsComplete{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }

    static boolean isCompleteBinaryTree(Node root) {
        if (root == null) return true;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean foundNull = false;

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr.left != null) {
                if (foundNull) return false;
                queue.add(curr.left);
            } else {
                foundNull = true;
            }

            if (curr.right != null) {
                if (foundNull) return false;
                queue.add(curr.right);
            } else {
                foundNull = true;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        if(isCompleteBinaryTree(root)){
            System.out.println("Complete");
        }
        else{
            System.out.println("Not Complete");
        }

    }
}