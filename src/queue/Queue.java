package queue;

public class Queue<T> {
	QueueNode<T> head;
	QueueNode<T> tail;

	/**
	 * Method to insert the data to queue
	 * 
	 * @param data
	 */
	public void enQueue(T data) {
		QueueNode<T> newNode = new QueueNode<>();
		newNode.data = data;
		newNode.next = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	/**
	 * Method to print the queue
	 */
	public void printQueue() {
		QueueNode<T> tempNode = head;
		while (tempNode != tail) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
		System.out.println(tempNode.data);
	}
}