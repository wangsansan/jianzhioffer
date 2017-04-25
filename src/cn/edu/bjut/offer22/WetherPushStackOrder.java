package cn.edu.bjut.offer22;

import java.util.Stack;

public class WetherPushStackOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = { 1, 2, 3, 4, 5 };
		int[] out = { 5, 4, 3, 2, 1 };
		WetherPushStackOrder question = new WetherPushStackOrder();
		boolean flag = question.pushOrder(in, out);
		System.out.println(flag);
	}

	public boolean pushOrder(int[] in, int[] out) {
		boolean result = false;
		if (in != null && out != null)
			if (in.length == out.length) {
				Stack<Integer> help = new Stack<>();
				int indexOfOut = 0;
				int indexOfIn = 0;
				while (indexOfOut != out.length) {
					while (help.size() > 0 && indexOfOut != out.length
							&& help.peek() == out[indexOfOut]) {
						help.pop();
						indexOfOut++;
					}

					//这个判断条件表示入栈节点已经全部push进栈了
					//经过上面的pop操作之后，如果indexOfOut还是不等于out序列的length，那一定是false了
					if (indexOfIn == in.length) {
						break;
					}

					while (indexOfIn != in.length
							&& in[indexOfIn] != out[indexOfOut]) {
						help.push(in[indexOfIn++]);
					}
					help.push(in[indexOfIn++]);
				}

				if (indexOfOut == out.length)
					result = true;
			}

		return result;
	}

}
