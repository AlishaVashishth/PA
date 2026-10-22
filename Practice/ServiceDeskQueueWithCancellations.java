import java.util.*;

// Standard queue (FIFO)
// A campus service desk serves students in the order they join. Each student has a unique integer ticket number.
// Process a sequence of operations and report the ticket number served by each SERVE operation. If the queue is
// empty when SERVE is requested, print EMPTY. A CANCEL x operation removes ticket x if it is still waiting; if x is not
// present, the queue remains unchanged. Cancellation must not change the relative order of the other waiting students.

class ServiceDeskQueueWithCancellations{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases - ");
        int t = sc.nextInt();
        while(t-- >0){
            Queue<Integer> queue = new LinkedList<>();
            
            int Q = sc.nextInt();
            while(Q-- >0){
                String op = sc.next();
                System.out.println();
                if(op.equals("JOIN")){
                    int num = sc.nextInt();
                    queue.offer(num);
                }
                else if(op.equals("SERVE")){
                    if(queue.isEmpty()){
                    System.out.println("EMPTY");
                    }
                    else{
                        System.out.println(queue.poll());
                    }
                }
                else if(op.equals("CANCEL")){
                    int num = sc.nextInt();
                    queue.remove(num);
                }
            }
            
        }
        sc.close();
    }
}