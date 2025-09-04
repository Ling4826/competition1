public class LinkedListStack {
    private ListNode top;
    private int length;

    // Node class for the stack
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor for LinkedListStack
    public LinkedListStack() {
        top = null;
        length = 0;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return length == 0;
    }

    // Push operation to add an element at the top
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    // Pop operation to remove and return the top element
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
