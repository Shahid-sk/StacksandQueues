package queue;

public class QueueMain {
	public static void main(String args[]) {
		Queue<Integer> newQueue = new Queue<>();
		newQueue.enQueue(56);
		newQueue.enQueue(30);
		newQueue.enQueue(70);
		newQueue.deQueue();  //delete the first element of queue

		// print queue
		newQueue.printQueue();
	}

}
