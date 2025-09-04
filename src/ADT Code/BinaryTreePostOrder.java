import java.util.ArrayList;
import java.util.List;

// Class for tree nodes
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

// Binary tree class
public class BinaryTreePostOrder {

    // Method to perform postorder traversal
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }

    // Helper method to recursively traverse the tree in postorder
    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse the left subtree
        postorderHelper(node.left, result);
        // Traverse the right subtree
        postorderHelper(node.right, result);
        // Visit the root
        result.add(node.val);
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreePostOrder tree = new BinaryTreePostOrder();
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing postorder traversal
        List<Integer> postorderResult = tree.postorderTraversal(root);
        System.out.println("Postorder traversal: " + postorderResult);
    }
}
