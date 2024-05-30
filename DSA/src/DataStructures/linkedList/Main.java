package DataStructures.linkedList;

import DataStructures.linkedList.LinkedList.Node;

public class Main {
	
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(4);
		
		myLinkedList.append(5);
		myLinkedList.append(3);
		System.out.println("the removed node is : "+myLinkedList.removeLast().value);
		myLinkedList.prepend(3);
		System.out.println("the removed node is : "+myLinkedList.removeFirst().value);
		System.out.println("the node in the index is : "+myLinkedList.get(1).value);
		System.out.println("the node in the index is : "+myLinkedList.set(1,6));
		System.out.println("the node in the index is : "+myLinkedList.insert(1,5));
		myLinkedList.remove(2);
		//System.out.println("the removed node is : "+myLinkedList.removeLast().value);
		myLinkedList.append(6);
		myLinkedList.append(7);
		myLinkedList.append(8);
		
		myLinkedList.getHead();
		myLinkedList.getTail();
		myLinkedList.getLength();
		myLinkedList.printList();
		myLinkedList.reverse();
		System.out.println("Reversed linked list:");
		myLinkedList.printList();
		
	}

}
