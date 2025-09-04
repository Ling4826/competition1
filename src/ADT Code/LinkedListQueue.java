import java.util.NoSuchElementException;

public class LinkedListQueue {
    private ListNode front, rear; // Pointers to the front and rear of the queue
    private int length; // Number of elements in the queue

    // Node class for the queue
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor for LinkedListQueue
    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Return the size of the queue
    public int length() {
        return length;
    }

    // Add data to the rear of the queue
    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    // Remove data from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    // Peek at the front of the queue
    public int first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    // Display the elements of the queue
    public void printQueue() {
        if (isEmpty()) {
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.printQueue();

        queue.dequeue();
        queue.printQueue();
    }
}
