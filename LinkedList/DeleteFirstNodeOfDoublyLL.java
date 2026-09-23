public class DeleteFirstNodeOfDoublyLL {
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



    public static Node DeleteAtBeginning(Node head){
        Node temp = head;
        if(head.next!=null){
            head=head.next;
        }
        head.prev=null;
        temp.next=null;
        
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

        head = DeleteAtBeginning(head);
        printForward(head);
    }
}
