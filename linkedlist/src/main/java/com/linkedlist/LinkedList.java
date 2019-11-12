package com.linkedlist;


public class LinkedList implements List {
	private int size;
	private Node head;

	static class Node {
		private Node next;
		private Object data;
	}
	public void add(Object data) {

		LinkedList.Node temp = new LinkedList.Node();
		temp.data = data;
		if (head == null) {
			head = temp;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = temp;

		}
		size = size + 1;
	
		
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public void iterate() {
		Node last =head;
		while (last != null) {
			System.out.println(last.data);
			last = last.next;
		}
		
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
