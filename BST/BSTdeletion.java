class BSTdeletion {
    // Node class representing each node of the tree
    static class Node {
        int value;
        Node left, right;

        // Constructor to create a new node
        Node(int item) {
            value = item;
            left = right = null;
        }
    }

    // Root of the BST
    Node root;

    // Constructor to initialize the root to null
    public BSTdeletion() {
        root = null;
    }

    // Delete a node with a given value
    void delete(int value) {
        root = deleteRec(root, value);
    }

    // Recursive helper function for deletion
    private Node deleteRec(Node root, int value) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }

        // Recur down the tree
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            // Node to be deleted is found

            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.value = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    // Function to get the minimum value (inorder successor)
    private int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // In-order traversal (for testing purposes)
    void inorder() {
        inorderRec(root);
    }

    // Recursive helper function for inorder traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Main function to test the BST deletion
    public static void main(String[] args) {
        BSTdeletion tree = new BSTdeletion();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal of the BST before deletion
        System.out.println("In-order traversal of the BST before deletion:");
        tree.inorder(); // Output: 20 30 40 50 60 70 80

        // Deleting nodes
        tree.delete(20);  // Deleting leaf node
        System.out.println("\n\nIn-order traversal after deleting 20:");
        tree.inorder(); // Output: 30 40 50 60 70 80

        tree.delete(30);  // Deleting node with one child
        System.out.println("\n\nIn-order traversal after deleting 30:");
        tree.inorder(); // Output: 40 50 60 70 80

        tree.delete(50);  // Deleting node with two children
        System.out.println("\n\nIn-order traversal after deleting 50:");
        tree.inorder(); // Output: 40 60 70 80
    }
}
