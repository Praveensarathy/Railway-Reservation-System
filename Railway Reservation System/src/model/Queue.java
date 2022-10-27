package model;

public class Queue {
	class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}
	Node rear;
	Node front;

	void enqueue(int val) {
		Node node = new Node(val);
		rear = node;
	}
	int dequeue() {
		
		return 0;
	}
	
}