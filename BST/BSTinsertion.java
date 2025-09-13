class BSTinsertion {
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
    public BSTinsertion() {
        root = null;
    }

    // Insert a new value into the BST
    void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper function for insertion
    private Node insertRec(Node root, int value) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // Otherwise, recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        // Return the unchanged root pointer
        return root;
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

    // Main function to test the BST insertion
    public static void main(String[] args) {
        BSTinsertion tree = new BSTinsertion();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal of the BST
        System.out.println("In-order traversal of the BST:");
        tree.inorder(); // Output should be sorted: 20 30 40 50 60 70 80
    }
}
