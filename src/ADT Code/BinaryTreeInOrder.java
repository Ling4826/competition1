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
public class BinaryTreeInOrder {

    // Method to perform inorder traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    // Helper method to recursively traverse the tree in inorder
    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Traverse the left subtree
        inorderHelper(node.left, result);
        // Visit the root
        result.add(node.val);
        // Traverse the right subtree
        inorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreeInOrder tree = new BinaryTreeInOrder();
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing inorder traversal
        List<Integer> inorderResult = tree.inorderTraversal(root);
        System.out.println("Inorder traversal: " + inorderResult);
    }
}
