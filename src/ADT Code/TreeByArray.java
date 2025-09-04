public class TreeByArray {
    int[] t;
    int pos = 0;
    public TreeByArray(int nb) {
        // create array size nb
        t = new int[nb];

        //initialize each element as -1
        for (int i = 0; i < nb; i++) {
            t[i] = -1;
        }
    }

    public void display(){
        for (int i = 0; i < t.length; i++) {
            System.out.println(" " + t[i]);
            //System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        TreeByArray myt = new TreeByArray(10);

        myt.insert(7);
        myt.insert(10);
        myt.insert(12);
        myt.insert(9);
        myt.insert(3);
        System.out.println("left of node 0 is " + myt.getLeft(0));
        System.out.println("right of node 0 is " + myt.getRight(0));
        System.out.println("parent of node 1 is " + myt.getParent(1));
        myt.display();
    }

    private int getParent(int curr) {
        if(curr == 0)
            return t[0];
        else
            return t[(curr-1)/2];
    }

    private int getRight(int parent) {
        return t[2*parent+2];
    }

    private int getLeft(int parent) {
        return t[2*parent+1];
    }

    private void insert(int num) {
        if(pos <= t.length - 1){
            t[pos] = num;
            pos++;
        }
    }
    
}
