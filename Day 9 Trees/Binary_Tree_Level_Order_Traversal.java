import java.util.*;
public class Binary_Tree_Level_Order_Traversal {
    public static void main(String[] args) {
        // Create a binary tree: [3, 9, 20, null, null, 15, 7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Create Solution object
        Binary_Tree_Level_Order_Traversal solution = new Binary_Tree_Level_Order_Traversal();

        // Get the level order traversal
        List<List<Integer>> result = solution.levelOrder(root);

        // Print the result
        System.out.println(result);
    }

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Solution method for level order traversal
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result; // If the tree is empty, return an empty list.
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // Add the root node to the queue.

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes at the current level.
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll(); // Dequeue the front node.
                level.add(current.val); // Add the node's value to the current level list.

                // Enqueue the left and right children if they exist.
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level); // Add the current level's list to the result.
        }

        return result; // Return the level order traversal.
    }
}
