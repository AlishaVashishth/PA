import java.util.*;

// Concept: Circular Queue
// A device stores the latest readings in a fixed-size circular buffer of capacity C. Initially, the buffer is empty. Process
// the commands ADD x, REMOVE, and ROTATE k. ADD inserts x at the rear; if the buffer is full, print FULL and do
// not insert. REMOVE prints and deletes the front item; if empty, print EMPTY. ROTATE k moves the front item to the
// rear k times. If the buffer is empty, ROTATE has no effect. Assume k is non-negative.

class CircularBufferRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int q = sc.nextInt();

        int[] queue = new int[c];
        int front = 0;
        int size = 0;

        for (int i = 0; i < q; i++) {
            String command = sc.next();

            if (command.equals("ADD")) {
                int num = sc.nextInt();

                if (size == c) {
                    System.out.println("FULL");
                } else {
                    int rear = (front + size) % c;
                    queue[rear] = x;
                    size++;
                }
            }

            else if (command.equals("REMOVE")) {
                if (size == 0) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(queue[front]);
                    front = (front + 1) % c;
                    size--;
                }
            }

            else if (command.equals("ROTATE")) {
                int k = sc.nextInt();

                if (size > 0) {
                    k = k % size;
                    front = (front + k) % c;
                }
            }
        }

        sc.close();
    }
}