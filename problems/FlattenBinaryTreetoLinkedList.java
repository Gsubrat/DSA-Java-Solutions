package problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class FlattenBinaryTreeToLinkedList {
    Queue<TreeNode> queue = new LinkedList<>(); // Global Declaration of Queue

    // Helper function to perform pre-order traversal
    public void addToQueue(TreeNode root) {
        if (root == null) {
            return;
        }
        // Storing the nodes in Queue according to pre-order traversal
        queue.add(root);
        addToQueue(root.left);  // Traverse left subtree
        addToQueue(root.right); // Traverse right subtree
    }

    public void flatten(TreeNode root) {
        // First, fill the queue with the nodes in pre-order
        addToQueue(root);

        // Now, we have the nodes in the queue in the correct order
        // Convert the tree to a right-skewed tree (linked list)
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();  // Get the next node
            // If there's another node in the queue, assign it to the right child
            if (!queue.isEmpty()) {
                temp.right = queue.peek();  // Set the right child
            }
            temp.left = null; // Set the left child to null as it's a single right-linked list
        }
    }

    // Sample Main Function to Test the Code
    public static void main(String[] args) {
        // Creating a simple binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        // Printing the flattened tree (right-skewed)
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.right;
        }
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    // Constructors for TreeNode
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
