class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    // Constructor for BST =>initial empty tree
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive insert function
    TreeNode insertRec(TreeNode root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to call inorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.value);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        /* Let's create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Print inorder traversal of the BST
        bst.inorder();
    }
}
