public class LinkedList {
    private Node head;

    public LinkedList() {
        setHead(null);
    }

    private void setHead(Node head) {
        this.head = head;
    }

    private Node getHead() {
        return this.head;
    }

    // add method
    public void add(StudentRecord sr) {
        if (getHead() == null) {
            Node temp = new Node(sr);
            temp.setNext(getHead());
            setHead(temp);
        } else {
            add(getHead(), sr);
        }
    }

    private void add(Node cur, StudentRecord sr) {
        if (cur.getNext() == null || cur.getNext().getData().getSsn() > sr.getSsn()) {
            Node temp = new Node(sr);
            temp.setNext(cur.getNext());
            cur.setNext(temp);
        } else {
            add(cur.getNext(), sr);
        }
    }

    // traverse method
    // recursive traverse
    public void traverse() {
        traverse(getHead());
    }

    private void traverse(Node cur) {
        if (cur != null) {
            System.out.println(cur);
            traverse(cur.getNext());
        }
    }

    // Iterative traverse/
    /*
     * public void traverse(){
     * Node cur = getHead();
     * while (cur != null) {
     * System.out.println(cur);
     * cur = cur.getNext();
     * }
     * }
     */
    public void traverse(String s) {
        System.out.println(s);
        traverse();
    }

    public StudentRecord find(int targSsn) {
        return find(getHead(), targSsn);
    }

    private StudentRecord find(Node cur, int targSsn) {
        if (cur == null)
            return null;
        else if (cur.getData().getSsn() == targSsn)
            return cur.getData();
        else
            return find(cur.getNext(), targSsn);
    }

    public void deleteFirst(int targSsn) {
        if (getHead() != null) {
            if (getHead().getData().getSsn() == targSsn) {
                setHead(getHead().getNext());
            } else {
                deleteFirst(getHead(), targSsn);
            }
        }
    }

    private void deleteFirst(Node cur, int targSsn) {
        if (cur.getNext() != null) {
            if (cur.getNext().getData().getSsn() == targSsn) {
                cur.setNext(cur.getNext().getNext());
            } else {
                deleteFirst(cur.getNext(), targSsn);
            }
        }
    }


}
