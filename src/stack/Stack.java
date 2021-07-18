package stack;

public class Stack<T> {
	StackNode<T> head;

	public void push(T data) {
		StackNode<T> newNode = new StackNode<>();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}

	public void printStack() {
		StackNode<T> tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}

}