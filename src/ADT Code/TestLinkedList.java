public class TestLinkedList {
    public static void main(String args[]) {
        LinkedList ell = new LinkedList();
        ell.traverse("Empty list traversal");
        ell.add(new StudentRecord("Adam", 3.0, 333));
        ell.add(new StudentRecord("Bozo", 2.0, 222));
        ell.add(new StudentRecord("Carl", 1.0, 444));
        ell.traverse("Should be 222 333 444");
        ell.add(new StudentRecord("Doug", 0.0, 111));
        ell.traverse("Should be 111 222 333 444");
        ell.deleteFirst(222);
        ell.traverse("Should be 111 333 444");
        ell.deleteFirst(999); 
        ell.deleteFirst(333);
        ell.deleteFirst(111);
        ell.deleteFirst(444);
        ell.traverse("Empty list???"); 
        } // end main
 // LinkedList
        
}
