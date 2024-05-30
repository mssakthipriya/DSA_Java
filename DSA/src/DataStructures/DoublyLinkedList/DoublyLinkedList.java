package DataStructures.DoublyLinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int length;
	
	
	class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value) {
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head: "+ head.value);
	}
	
	public void getTail() {
		System.out.println("Tail: "+tail.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+length);
	}

	
	public void append(int value) {
		Node temp = new Node(value);
		if(head==null) {
			tail = temp;
			head = temp;
			
		}else {
		tail.next = temp;
		temp.prev = tail;
		tail = temp;
		}
		
		length++;
	}
	
	public Node removeLast() {
		if(head == null) {
			return null;
		}
		
		Node temp = tail;
		if(head.next==null) {
			head = null;
			tail = null;
		}else {		
		tail = temp.prev;
		tail.next = null;
		temp.prev = null;
		}
		length--;
			
		return temp;
	}
	
	public void prepend(int value) {
		Node temp = new Node(value);
		if(head==null) {
			head = temp;
			tail = temp;
		}else {
		temp.next = head;
		head.prev = temp;
		head = temp;
		}
		
		length++;
	}
	
	public Node removeFirst() {
		if(head == null) return null;
		
		Node temp = head;
		if(head.next == null) {
			head = null;
			tail = null;
		}else {
		head = temp.next;
		temp.next = null;
		head.prev = null;
		}
		length--;
		
		return temp;
	}
	
	
	public Node get(int index) {
		if((index<0)||(index>=length) ) return null;
		Node temp = head;
		if(index<length/2) {
			
			for(int i = 0; i<index;i++) {
				temp = temp.next;
			}
		}else {
			temp = tail;
			for(int i = length-1; i> index;i--) {
				temp = temp.prev;
			}
		}
	
	
		return temp;
	}
	
	public boolean set(int index,int value) {
		if((index<0)||(index>=length)) return false;
		Node temp = head;
		if(index<length/2) {
			for(int i=0;i<index;i++) {
				temp = temp.next;
			}
		}else {
			temp = tail;
			for(int i = length-1;i>index;i--) {
				temp = temp.prev;
			}
		}
		
		temp.value = value;
		
		return true;
	}
	
	public boolean insert(int index,int value) {
		if((index<0)||(index>=length)) return false;
		if(index == 0) {
			prepend(value);
			return true;
		}
		if(index == length) {
			append(value);
			return true;
		}
		
		Node newNode  = new Node(value);
		Node before = get(index-1);
		Node after = before.next;
		newNode.prev = before;
		newNode.next = after;
		before.next = newNode;
		after.prev = newNode;
		length++;
		
		return true;
	}
	
	public Node remove(int index) {
		if((index<0)||(index>=length)) return null;
		if(index == 0) return removeFirst();
		if(index == length) return removeLast();
		
		Node temp = get(index);
		Node before = temp.prev;
		Node after = temp.next;
		before.next = temp.next;
		after.prev = temp.prev;
		temp.next = null;
		temp.prev = null;
		
		length--;
		
		return temp;
	}
	
}
