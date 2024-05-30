package DataStructures.Stack;

public class Stack {
	private Node top;
	private int height;
	
	class Node{
		Node next;
		int value;
		
		Node (int value){
			this.value = value;
		}
	}
	
	public Stack(int value) {
	Node newNode = new Node(value);
	top = newNode;
	height = 1;
	}
	
	public void printStack() {
		Node temp = top;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getTop() {
		System.out.println("Top: "+ top.value);
	}
	
	public void getHeight() {
		System.out.println("Height: "+ height);
	}
	
	public void push(int value) {
		Node temp = new Node(value);
		if(top == null) {
			top = temp;
		}else {
		temp.next = top;
		top = temp;
		}
		height++;
	}
	
	public Node pop() {
		if(top == null) {
			return null;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;

	}
}
