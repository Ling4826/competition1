public class Node {
    private StudentRecord data;
    private Node next;
    public Node(StudentRecord data){
        setData(data);
        setNext(null);
    }
    public void setData(StudentRecord data){
        this.data = data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public StudentRecord getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public String toString(){
        if(data == null){
            return "Node: null";
        } else {
            return "Node: " + data.toString();
        }
    }
/*
    public static void main(String[] args) {
        StudentRecord sr = new StudentRecord("Bob", 3.5, 123456789);
        Node n1 = new Node(null);
        System.out.println("Empty node test\n" + n1);

        n1.setData(sr);
        System.out.println("Bob" + n1);
        sr = new StudentRecord("Mary",3.7,987654321);
        Node n2 = new Node(sr);
        n1.setNext(n2);
        System.out.println("Bob: " +n1);
        System.out.println("Mary: " + n2);

    }*/
}
