package com.day3.task_2;

public class CircularLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head = null;
	private Node tail = null;

//    // Insert at the end: O(1)
//    public void add(int data) {
//        Node newNode = new Node(data);
//
//        // If list is empty
//        if (head == null) {
//            head = tail = newNode;
//            newNode.next = head;
//        } else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//    }
//
//    // Delete a node by value: O(n)
//    public boolean delete(int data) {
//
//        // If list is empty
//        if (head == null) {
//            return false;
//        }
//
//        Node current = head;
//        Node previous = tail;
//
//        do {
//            if (current.data == data) {
//
//                // Case 1: Only one node
//                if (head == tail) {
//                    head = null;
//                    tail = null;
//                }
//
//                // Case 2: Deleting head
//                else if (current == head) {
//                    head = head.next;
//                    tail.next = head;
//                }
//
//                // Case 3: Deleting tail
//                else if (current == tail) {
//                    previous.next = head;
//                    tail = previous;
//                }
//
//                // Case 4: Deleting middle node
//                else {
//                    previous.next = current.next;
//                }
//
//                return true;
//            }
//
//            previous = current;
//            current = current.next;
//
//        } while (current != head);
//
//        return false;
//    }
//
    
	public void add(int data) {

		// 1. Create newNode
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = head;
			newnode.next = head;
		} else {
			tail.next = newnode;
			tail = newnode;
			tail.next = head;
		}
		// 2. If list is empty: head = tail = newNode, newNode.next = head
		// 3. Else: tail.next = newNode, tail = newNode, tail.next = head
	}

	public boolean delete(int data) {
	    // 1. If list is empty, return false
	    if (head == null) { 
	        return false; 
	    } 

	    // 2. Handle single-node list scenario
	    if (head.data == data && head == tail) {
	        head = null;
	        tail = null;
	        return true;
	    }

	    // 3. Handle head removal (list has multiple nodes)
	    if (head.data == data) { 
	        head = head.next; 
	        tail.next = head; // Maintain circular invariant
	        return true;
	    } 

	    // 4. Handle middle or tail removal (list has multiple nodes)
	    Node prev = head; 
	    Node curr = head.next; 

	    while (curr != head) { 
	        if (curr.data == data) { 
	            // If deleting the tail, update the tail reference first
	            if (curr == tail) {
	                tail = prev;
	            }
	            
	            prev.next = curr.next; 
	            return true; 
	        } 
	        
	        // Move both pointers forward
	        prev = curr; 
	        curr = curr.next; 
	    } 

	    // Element not found
	    return false; 
	}
	
	// Display circular linked list
    public void display() {

        if (head == null) {
            System.out.println("Circular List: (empty)");
            return;
        }

        Node current = head;

        System.out.print("Circular List: ");

        do {
            System.out.print(current.data + " -> ");
            current = current.next;

        } while (current != head);

        System.out.println("(head: " + head.data + ")");
    }


}
