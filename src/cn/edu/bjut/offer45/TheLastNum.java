package cn.edu.bjut.offer45;

import java.util.LinkedList;
import java.util.List;

public class TheLastNum {
	public static void main(String[] args) {
		int n = 100;
		int m = 2;
		TheLastNum question = new TheLastNum();
		int ret = question.theLastValue(n, m);
		System.out.println(ret);
	}

	int theLastValue(int n, int m) {
		if (n < 0)
			return -1;
		if (n == 1) {
			return n;
		} else {
			List numbers = new LinkedList<Integer>();
			for (int i = 1; i <= n; i++) {
				numbers.add(i);
			}
			int index = -1;
			while (numbers.size() > 1) {
				for (int i = 0; i < m; i++) {
					index++;
					if (index == numbers.size())
						index = 0;
				}

				numbers.remove(index);
				index--;
			}

			return (int) numbers.get(0);
		}
	}
}
