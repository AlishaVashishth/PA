public class InsertionInDoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev=null;
            this.next=null;
        }
    }



    public static Node InsertAtBeginning(Node head, int val){
        Node new_node = new Node(val);
        new_node.next = head;
        if(head != null) head.prev = new_node;

        head = new_node;
        return head;
    }

    public static void printForward(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    

    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head.next = second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        third.next=fourth;
        fourth.prev=third;

        InsertAtBeginning(head,1);
        printForward(head);
    }
}
