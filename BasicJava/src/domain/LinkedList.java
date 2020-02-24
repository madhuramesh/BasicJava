package domain;

public class LinkedList {
	int data;
	LinkedList next;
	LinkedList prev;
	
	public LinkedList(int data) {
		this.data = data;
		
	}
	
	public int getPrev() {
		return this.prev.data;
	}
	
	public int getNext() {
		return this.next.data;
	}
	
	public void setNext(LinkedList node) {
		node.next = this.next;
		this.next = node;
		node.prev = this;
		
	}
	
	public void insert(int data, LinkedList node) {
		
		if (this.next == null) 
		{
				this.next = node;
				node.prev = this;
		}
		else
		{
			setNext(node);
			
		}
	}
	
	public void delete(int data, LinkedList node) {
		
		if (this.data == data)
		{
			prev.next = this.next;
			next.prev = this.prev;
		}
	}

}
