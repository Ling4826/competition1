public class Queue {
    static private int front, rear, capacity;
    static private int[] queue;

    public Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
}

    static void queueEnqueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full.");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    static void queueDequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = 0;
            rear--;
        }
        return;
    }

    static void queueDisplay() {
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
        return;
    }

    static void queueFront() {
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);

        return;

    }
    static boolean isEmpty(){
        if (front == rear) {
            return true;
        } else {
            return false;
        }
    } 

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.queueDisplay();

        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);

        q.queueDisplay();

        q.queueEnqueue(60);

        q.queueDequeue();
        q.queueDequeue();

        q.queueDisplay();

        q.queueFront(); // first(), peek()

    }
}