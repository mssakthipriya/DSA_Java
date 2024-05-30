package DataStructures.Stack;

public class Main {
public static void main(String[] args) {
	Stack myStack = new Stack(4);
	myStack.push(5);
	myStack.push(6);
	System.out.println("popped element: "+myStack.pop().value);
	myStack.getTop();
	myStack.getHeight();
	myStack.printStack();
	
}
}
