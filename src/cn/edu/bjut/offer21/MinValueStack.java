package cn.edu.bjut.offer21;

import java.util.Stack;

public class MinValueStack {

	public Stack<Integer> normalStack = new Stack<>();
	public Stack<Integer> minStack = new Stack<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void push(Integer value) {
		normalStack.push(value);

		if (normalStack.size() > 1 && value > minStack.peek())
			minStack.push(minStack.peek());
		else
			minStack.push(value);

		/*
		 * if(normalStack.size() == 1) minStack.push(value); else{ if(value >
		 * minStack.peek()) minStack.push(minStack.peek()); else
		 * minStack.push(value); }
		 */

	}

	Integer pop() {
		if (minStack.size() == 0 || normalStack.size() == 0)
			throw new RuntimeException("空栈，无保存值");
		minStack.pop();
		return normalStack.pop();
	}

	Integer getMinValue() {
		if (minStack.size() == 0)
			throw new RuntimeException("无记录");
		return minStack.peek();
	}

}
