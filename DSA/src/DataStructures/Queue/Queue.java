package DataStructures.Queue;

public class Queue {

	private Node first;
	private Node last;
	private int length;
	
	class Node{
		Node next;
		int value;
		Node(int value){
			this.value = value;
		}
	}
	
	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}
	
	public void printQueue() {
		Node temp = first;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getFirst() {
		System.out.println("First: "+ first.value);
	}
	
	public void getLast() {
		System.out.println("Last:"+ last.value);
	}
	
	public void getLength(){
		System.out.println("Length:"+length);
	}
	
	public void enqueue(int value) {
		Node temp = new Node(value);
		if(first == null) {
			first = temp;
			last = temp;
		}else {
			last.next = temp;
			last = temp;
		}
		
		length++;
	}
	
	public Node dequeue() {
		if(first == null) return null;
		Node temp = first;
		if(first.next==null) {
			first = null;
			last = null;
		}else {
		first = first.next;
		temp.next = null;
		}
		length--;
		
		return temp;
	}
}
