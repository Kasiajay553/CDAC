package com.day4.task_1;

public class BinarySearchTree {

	static class Node {
		int key;
		Node left;
		Node right;

		Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	private Node root = null;

	// Public method to insert a key
	public void insert(int key) {
		root = insertRec(root, key);
	}

	// Helper recursive method to insert: O(h) where h = height
	private Node insertRec(Node node, int key) {
		// 1. If node is null, return new Node(key)
		if (node == null) {
			return new Node(key);
		}

		// 2. If key < node.key, node.left = insertRec(node.left, key)
		if (key < node.key) {
			node.left = insertRec(node.left, key);
		}
		// 3. Else if key > node.key, node.right = insertRec(node.right, key)
		else if (key > node.key) {
			node.right = insertRec(node.right, key);
		}

		// 4. Return unchanged node pointer
		return node;
	}

	// Search for a key: O(h)
	public boolean search(int key) {
		Node curr = root;

		// Traverse using while loop
		while (curr != null) {
			// If key == curr.key return true
			if (key == curr.key) {
				return true;
			}
			// If key < curr.key move left, else move right
			if (key < curr.key) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		return false;
	}

	// In-order traversal: Left -> Root -> Right (Produces sorted output)
	public void inorder() {
		System.out.print("In-order:   ");
		inorderRec(root);
		System.out.println();
	}

	private void inorderRec(Node node) {
		// If node != null: traverse left, print key + " ", traverse right
		if (node != null) {
			inorderRec(node.left);
			System.out.print(node.key + " ");
			inorderRec(node.right);
		}
	}

	// Pre-order traversal: Root -> Left -> Right
	public void preorder() {
		System.out.print("Pre-order:  ");
		preorderRec(root);
		System.out.println();
	}

	private void preorderRec(Node node) {
		// If node != null: print key + " ", traverse left, traverse right
		if (node != null) {
			System.out.print(node.key + " ");
			preorderRec(node.left);
			preorderRec(node.right);
		}
	}

	// Public delete method
	public void delete(int key) {
		root = deleteRec(root, key);
	}

	private Node deleteRec(Node node, int key) {
		if (node == null) {
			return null;
		}
		if (key < node.key) {
			node.left = deleteRec(node.left, key);
		} else if (key > node.key) {
			node.right = deleteRec(node.right, key);
		} else {
			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}
			// Case 3: Node with two children
			// - Find in-order successor (min node in right subtree)
			Node successor = findMin(node.right);
			// - Copy successor's key into current node
			node.key = successor.key;
			// - Recursively delete the successor key from the right subtree
			node.right = deleteRec(node.right, successor.key);
		}
		return node;
	}

	private Node findMin(Node node) {
		// Walk left until node.left is null, then return the leftmost node
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
}
