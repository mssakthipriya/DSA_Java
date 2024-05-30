package DataStructures.Queue;

public class Main {
	
	
public static void main(String[] args) {
	Queue myQueue = new Queue(7);
	
	myQueue.enqueue(8);
	myQueue.enqueue(9);
	myQueue.dequeue();
	myQueue.getFirst();
	myQueue.getLast();
	myQueue.getLength();
	myQueue.printQueue();
}
}
