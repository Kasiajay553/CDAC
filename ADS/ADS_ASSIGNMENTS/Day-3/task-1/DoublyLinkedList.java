package com.day3.task_1;

public class DoublyLinkedList {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	private Node head = null;
	private Node tail = null;

	// Insert at the beginning: O(1)
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}

	// Insert at the end: O(1)
	public void addLast(int data) {
		// TODO: Create new node and attach at tail, update prev and next
		Node newNode = new Node(data);
		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}

	// Delete a node by value: O(n)
	public boolean delete(int data) {
		
		if (head == null) {
			return false;
		}

		Node curr = head;

		while (curr != null) {
			if (curr.data == data) {

				
				if (curr == head) {
					head = curr.next;
					if (head != null) {
						head.prev = null;
					} else {
						tail = null; 
					}
				}
				
				else if (curr == tail) {
					tail = curr.prev;
					if (tail != null) {
						tail.next = null;
					}
				}
				
				else {
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}

				return true; 
			}
			curr = curr.next;
		}

		return false; 
	}
	
	// Print elements from head to tail
    public void displayForward() {
       if(head==null) {
    	   return;
       }
       Node curr=head;
       System.out.print("Forward: ");
       while(curr!=null) {
    	   System.out.print(curr.data);
    	   if(curr.next!=null) {
    		   System.out.print(" <=> ");
    	   }
    	   curr=curr.next;
       }
       System.out.println();
    }
    
    // Print elements from tail to head
    public void displayBackward() {
    	if(tail==null) {
     	   return;
        }
        Node curr=tail;
        System.out.print("Backward: ");
        while(curr!=null) {
     	   System.out.print(curr.data);
     	   if(curr.prev!=null) {
     		   System.out.print(" <=> ");
     	   }
     	   curr=curr.prev;
        }
        System.out.println();
    }

}
