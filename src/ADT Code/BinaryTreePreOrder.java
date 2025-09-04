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
public class BinaryTreePreOrder {

    // Method to perform preorder traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    // Helper method to recursively traverse the tree in preorder
    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        // Visit the root
        result.add(node.val);
        // Traverse the left subtree
        preorderHelper(node.left, result);
        // Traverse the right subtree
        preorderHelper(node.right, result);
    }

    public static void main(String[] args) {
        // Example usage
        BinaryTreePreOrder tree = new BinaryTreePreOrder();
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Performing preorder traversal
        List<Integer> preorderResult = tree.preorderTraversal(root);
        System.out.println("Preorder traversal: " + preorderResult);
    }
}
