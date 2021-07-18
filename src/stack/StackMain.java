package stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> newStack = new Stack<>();
		newStack.push(70);
		newStack.push(30);
		newStack.push(56);
		newStack.printStack();

		int topElement = newStack.peek();
		System.out.println("The element at the top of the stack is : "+topElement);
		int deletedElement = newStack.pop();
		System.out.println("Deleted top most element is :" +deletedElement);
		newStack.peek();
		newStack.pop();
		newStack.peek();
		newStack.pop();
		newStack.printStack();
		newStack.isEmpty();
	}

}
