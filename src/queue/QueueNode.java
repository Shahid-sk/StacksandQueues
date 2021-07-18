package queue;

public class QueueNode<T> {
	T data;
	QueueNode<T> next;

	// Generating default constructor
	public QueueNode() {
		super();
	}

	// Generating getters and setters
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public QueueNode<T> getNext() {
		return next;
	}

	public void setNext(QueueNode<T> next) {
		this.next = next;
	}

}
