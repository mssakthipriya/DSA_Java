package DataStructures.ReverseBetween;

public class LinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
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
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
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
        }
        length++;
    }

    // WRITE THE REVERSEBETWEEN METHOD HERE //
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
    
        public void reverseBetween(int m,int n){
    	
    	if(head==null)return;
    	
		Node temp  = head;
		Node before = null;
		Node after = null;
		Node s = null;
		Node befores = null;
		for(int i=0;i<=n;i++) {	
			if(i == m) {
				befores = before;
				s = temp;
				
				}
			if(i>=m) {
			after = temp.next;
			temp.next = before;	
			before = temp;
			temp = after;
			}else {
				before=temp;
				temp=temp.next;
				after = temp.next;
			}

		}

		if(befores!=null) {
		befores.next = before;
		s.next = temp;
		}else {
			head = before;
    		s.next = temp;

		}

    }

}