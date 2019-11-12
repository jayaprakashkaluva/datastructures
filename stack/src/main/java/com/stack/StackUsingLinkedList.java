package com.stack;

public class StackUsingLinkedList implements Stack {

	private static final int MAX_SIZE = 5;
	private int size;
	private Node head;

	static class Node {
		private Node next;
		private Object data;
	}

	public int getSize() {
		return size;
	}

	public void display() {
		Node last =head;
		while (last != null) {
			System.out.println(last.data);
			last = last.next;
		}
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void push(Object data) {
		StackUsingLinkedList.Node temp = new StackUsingLinkedList.Node();
		temp.data = data;
		if (head == null) {
			head = temp;
		} else {
			Node last = head;
			while (last != null && last.next != null) {
				last = last.next;
			}
			last.next = temp;

		}
		size = size + 1;
	}

	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
