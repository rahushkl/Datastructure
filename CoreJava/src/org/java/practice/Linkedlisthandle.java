package org.java.practice;
public class Linkedlisthandle {
	class Node{
		Node next = null;
		int data;
		Node(int d){
			this.data = d;
		}
		void append(int d){
			Node end = new Node(d);
			Node n = this;
			while(n.next!=null)
			{
				n = n.next;
			}
			n = end;
		}
	}
	Node DeleteNode(int d, Node head){
		Node n = head;
		if(n.data == d)
		{
			return head.next;
		}
		while(n.next!=null)
		{
			if(n.next.data == d)
			{
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;	
	}

	public static void main(String[] args) {
		
	}

}
