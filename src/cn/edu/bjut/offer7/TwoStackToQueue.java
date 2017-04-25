package cn.edu.bjut.offer7;

import java.util.Stack;

public class TwoStackToQueue {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();

	public void addToQueue(int value) {
		s1.push(value);
	}

	public Integer getFromQueue() {
		if (s2.isEmpty()) {
			if (s1.isEmpty())
				return null;
			else {
				int size = s1.size();
				for (int i = 0; i < size; i++)
					s2.push(s1.pop());
				return s2.pop();
			}
		}

		return s2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackToQueue queue = new TwoStackToQueue();
		queue.addToQueue(1);
		queue.addToQueue(2);
		System.out.println(queue.getFromQueue());
		queue.addToQueue(3);
		System.out.println(queue.getFromQueue());
		
		
		/*Stack<Integer> ss = new Stack<>();
		ss.add(1);
		ss.add(2);
		ss.add(3);
		System.out.println(ss.size());*/
	}

}
