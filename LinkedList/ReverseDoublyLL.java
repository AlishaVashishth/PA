public class ReverseDoublyLL {
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

    public static Node reverse(Node head){
        Node curr=head;
        Node new_head = null;
        while(curr!=null){
            Node temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            new_head = curr;
            curr = curr.prev;
        }
        return new_head;
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

        head = reverse(head);
        printForward(head);
    }
}
