package Tree.AvlTree;


// Java program for insertion in AVL Tree
class Node {
    int key, height;
    Node left, right;

    Node(int d) {
        key = d;
        height = 1;
    }
}

class AVLTree {
    /**
     * LL : rotateRight(root)
     * RR : rotateLeft(root)
     * LR : 1. rotateLeft(root.left)
     *      2. rotateRight(root)
     * RL : 1. rotateRight(root.right)
     *      2. rotateLeft(root)
     *
     * bf(x)= height(left subtree) - height(right subtree)
     *
     * if bf(x) < 0 ==> left heavy
     * if bf(x) > 0 ==> right heavy
     * if bf(x) = 0 ==> balanced
     *
     * if tree is right heavy
     * {
     *     if right subtree is left heavy
     *     {
     *          RL case
     *     }
     *     else
     *     {
     *         RR case
     *     }
     * }
     * else if tree left heavy
     * {
     *     if left subtree is right heavy
     *     {
     *         LR case
     *     }
     *     else
     *     {
     *         LL case
     *     }
     * }
     */
    Node root;

    // A utility function to get the height of the tree
    int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }

    // A utility function to get maximum of two integers
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // A utility function to right rotate subtree rooted with y
    // See the diagram given above.
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    // A utility function to left rotate subtree rooted with x
    // See the diagram given above.
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    // Get Balance factor of node N
    int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    Node insert(Node node, int key) {

        /* 1. Perform the normal BST insertion */
        if (node == null)
            return (new Node(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else // Duplicate keys not allowed
            return node;

        /* 2. Update height of this ancestor node */
        node.height = 1 + max(height(node.left),
                height(node.right));

		/* 3. Get the balance factor of this ancestor
			node to check whether this node became
			unbalanced */
        int balance = getBalance(node);

        // If this node becomes unbalanced, then there
        // are 4 cases Left Left Case
        if (balance > 1)
        {
            if (key < node.left.key)
            {
                return rightRotate(node);
            }
            else if (key > node.left.key)
            {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (balance < -1)
        {
            if (key > node.right.key)
            {
                return leftRotate(node);
            } else if (key < node.right.key)
            {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        /* return the (unchanged) node pointer */
        return node;
    }

    // A utility function to print preorder traversal
    // of the tree.
    // The function also prints height of every node
    void inOrder(Node node) {
        if (node != null) {

            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }
    /* Given a non-empty binary search tree, return the
        node with minimum key value found in that tree.
        Note that the entire tree does not need to be
        searched. */
    Node minValueNode(Node node)
    {
        Node current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;

        return current;
    }

    Node deleteNode(Node root, int key)
    {
        // STEP 1: PERFORM STANDARD BST DELETE
        if (root == null)
            return root;

        // If the key to be deleted is smaller than
        // the root's key, then it lies in left subtree
        if (key < root.key)
            root.left = deleteNode(root.left, key);

            // If the key to be deleted is greater than the
            // root's key, then it lies in right subtree
        else if (key > root.key)
            root.right = deleteNode(root.right, key);

            // if key is same as root's key, then this is the node
            // to be deleted
        else
        {

            // node with only one child or no child
            if (root.left == null)
            {
                root = root.right;
            }
            else if (root.right == null)
            {
                root = root.left;
            }
            else
            {

                Node succParent = root;
                Node succ = root.right;
                while (succ.left != null)
                {
                    succParent = succ;
                    succ = succ.left;
                }
                if (succParent != root)
                    succParent.left = succ.right;
                else
                    succParent.right = succ.right;
                // Copy Successor Data to root
                root.key = succ.key;
            }
        }

        // If the tree had only one node then return
        if (root == null)
            return root;

        // STEP 2: UPDATE HEIGHT OF THE CURRENT NODE
        root.height = max(height(root.left), height(root.right)) + 1;

        // STEP 3: GET THE BALANCE FACTOR OF THIS NODE (to check whether
        // this node became unbalanced)
        int balance = getBalance(root);

        // If this node becomes unbalanced, then there are 4 cases
        if (balance > 1)
        {
            if (getBalance(root.left) >= 0)
            {
                return rightRotate(root);
            }
            else
            {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (balance < -1)
        {
            if (getBalance(root.right) <= 0)
            {
                return leftRotate(root);
            }
            else
            {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }

        return root;
    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 0);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, -1);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);

        /* The constructed AVL Tree would be
        9
        / \
        1 10
        / \ \
        0 5 11
        / / \
        -1 2 6
        */
        System.out.println("Preorder traversal of "+
                "constructed tree is : ");
        tree.inOrder(tree.root);

        tree.root = tree.deleteNode(tree.root, 10);

        /* The AVL Tree after deletion of 10
        1
        / \
        0 9
        /     / \
        -1 5 11
        / \
        2 6
        */
        System.out.println("");
        System.out.println("Preorder traversal after "+ "deletion of 10 :");
        tree.inOrder(tree.root);
        ////////////////
        tree.root = tree.deleteNode(tree.root, 5);
        System.out.println("");
        System.out.println("Preorder traversal after "+ "deletion of 5 :");
        tree.inOrder(tree.root);
        ////////////////
        tree.root = tree.deleteNode(tree.root, 0);
        System.out.println("");
        System.out.println("Preorder traversal after "+ "deletion of 0 :");
        tree.inOrder(tree.root);
    }

}
