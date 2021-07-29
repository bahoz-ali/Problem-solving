package Queue;

import java.util.Stack;

public class StackQueue {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> store = new Stack<>();

	public void enQueue(int item) {
		if (stack.isEmpty())
			stack.push(item);

		else {
			while (!stack.isEmpty())
				store.push(stack.pop());

			stack.push(item);

			while (!store.isEmpty())
				stack.push(store.pop());
		}

	}

	public int deQueue() {
		return stack.pop();
	}

	public int peek() {
		return stack.peek();
	}

	public void print() {
		System.out.println(stack);
	}

}
