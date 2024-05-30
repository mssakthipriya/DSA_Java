package DataStructures.SwapList;

public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
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
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    // WRITE THE SWAPPAIRS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    
    public void swapPairs(){
    	Node first = head;
    	Node second = first.next;

    	while(second!=null) {
    		if(first == head) {
        		second.prev = null;	
        		head = second;
    		}else {
    			first.prev.next = second;
    			second.prev = first.prev;
    		}
    		
    		first.next = second.next;
    		first.prev = second;
    		if(second.next!=null) {
    		second.next.prev = first;
    		}
    		second.next = first;
 		
    		first = first.next;
    		if(first!=null) {
    		second = first.next;
    		}else {
    			second = null;
    		}
    		
    	}
    }
    
}