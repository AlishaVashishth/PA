class Implementation{
    static class CircularQueue{
        int[] arr;
        int front,rear,size,capacity;
        CircularQueue(int capacity){
            this.capacity=capacity;
            arr = new int[capacity];
            front=0;
            rear=-1;
            size=0;
        }
        void enqueue(int val){
            if(size==capacity){
                System.out.println("Queue is Full.");
                return;
            }
            rear=(rear+1)%capacity;
            arr[rear]=val;
            size++;
            System.out.println(val+" inserted at "+rear);
        }
        void dequeue(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return;
            }
            System.out.println("removed "+ arr[front]);
            front=(front+1)%capacity;
            size--;
        }
        void display(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return;
            }
            System.out.print("Queue - ");
            for(int i=0;i<size;i++){
                int idx = (front+i)%capacity;
                System.out.print(arr[idx]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();

        q.enqueue(60);
        q.display();

        q.dequeue();
        q.enqueue(60);
        q.display();
    }
}