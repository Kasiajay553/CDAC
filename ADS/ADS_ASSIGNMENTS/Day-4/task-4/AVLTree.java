package com.day4.task_4;

public class AVLTree {
    static class Node {
        int key;
        int height;
        Node left;
        Node right;

        Node(int key) {
            this.key = key;
            this.height = 1;
        }
    }

    private Node root = null;

    private int height(Node n) {
        return n == null ? 0 : n.height;
    }

    private int getBalance(Node n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    // Right rotate subtree rooted at y (Resolves Left-Left heavy imbalance)
    private Node rightRotate(Node y) {
        // 1. Identify nodes
        Node x = y.left;
        Node T2 = x.right;

        // 2. Perform rotation
        x.right = y;
        y.left = T2;

        // 3. Update heights (y first, since it is now a child of x)
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // 4. Return new root x
        return x;
    }

    // Left rotate subtree rooted at x (Resolves Right-Right heavy imbalance)
    private Node leftRotate(Node x) {
        // 1. Identify nodes
        Node y = x.right;
        Node T2 = y.left;

        // 2. Perform rotation
        y.left = x;
        x.right = T2;

        // 3. Update heights (x first, since it is now a child of y)
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // 4. Return new root y
        return y;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node node, int key) {
        // 1. Standard BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        } else {
            return node; // Duplicate keys are not allowed in this implementation
        }

        // 2. Update height of this ancestor node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Compute balance factor
        int balance = getBalance(node);

        // 4. Handle Rotations
        // LL Case
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // RR Case
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // LR Case
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public int getRootKey() {
        return root != null ? root.key : -1;
    }

    public int getTreeHeight() {
        return height(root);
    }

    public void inorder() {
        System.out.print("AVL In-order: ");
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.key + " ");
            inorderRec(node.right);
        }
    }
}
