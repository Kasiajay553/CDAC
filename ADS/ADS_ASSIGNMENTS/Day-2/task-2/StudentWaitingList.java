package com.day2.task_2;

public class StudentWaitingList {

	private static class Node {

		int rollNo;
		String name;
		Node next;

		Node(int rollNo, String name) {
			this.rollNo = rollNo;
			this.name = name;
			this.next = null;
		}
	}

	private Node head = null;
	private Node tail = null;
	private int size=0;
	private Node curr;

	public void addFirst(int rollNo, String name) {
		Node newnode = new Node(rollNo, name);
		if (head == null) {
			head = newnode;
			tail = newnode;
			size++;
			return;
		}
		newnode.next = head;
		head = newnode;
		size++;
		

	}

	public void addLast(int rollNo, String name) {
		Node newnode = new Node(rollNo, name);
		if (tail == null) {
			head = newnode;
			tail = newnode;
			size++;
			return;
		}
		tail.next = newnode;
		tail = newnode;
		size++;
		
	}

	public boolean removeByRollNo(int rollNo) {
		if (head == null) {
			System.out.println("The Queue is Empty we canbt remove : " + rollNo);
			return false;
		}
		if (head.rollNo == rollNo) {
			head = head.next;
			size--;
			return true;
		}

		curr = head.next;
		Node temp = head;
		while (curr != null) {
			if (curr.rollNo == rollNo) {
				temp.next = curr.next;
				curr.next = null;
				size--;
				return true;
			}
			temp = curr;
			curr = curr.next;

		}
		return false;

	}

	public void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print("[ " + curr.rollNo + " : " + curr.name + " ] -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}

	public int size() {
		return size;
	}
}
