package cn.edu.bjut.offer34.important;

import java.util.Stack;

public class UglyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UglyNum question = new UglyNum();
		int n = 8;
		int value = question.getUglyNumByOrder(n);
		System.out.println(value);
	}

	public int getUglyNumByOrder(int n) {
		if (n < 1)
			return 0;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		Stack<Integer> uglyNums = new Stack<>();
		uglyNums.push(1);
		while (uglyNums.size() != n + 1) {
			int value = getCurrentMinUglyNum(index2, index3, index5, uglyNums);
			uglyNums.push(value);
			while (uglyNums.get(index2) * 2 <= value)
				index2++;
			while (uglyNums.get(index3) * 3 <= value)
				index3++;
			while (uglyNums.get(index5) * 5 <= value)
				index5++;
		}
		return uglyNums.peek();
	}

	public int getCurrentMinUglyNum(int index2, int index3, int index5,
			Stack<Integer> nums) {
		int value = 0;

		int value2 = nums.get(index2) * 2;
		int value3 = nums.get(index3) * 3;
		int value5 = nums.get(index5) * 5;

		if (value2 <= value3 && value2 <= value5) {
			value = value2;
		}
		if (value3 <= value2 && value3 <= value5) {
			value = value3;
		}
		if (value5 <= value3 && value5 <= value2) {
			value = value5;
		}
		return value;
	}
}

class Node {
	int index;
	int value;
}
