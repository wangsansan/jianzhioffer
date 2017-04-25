package cn.edu.bjut.offer24;

import java.util.Arrays;

public class BackOrderOfTree {

	boolean isBackOrderOfATree(int[] order, int length) {
		boolean result = false;
		if (length < 1) {
			return true;
		}
		if (order != null) {
			int left = 0;
			for (; left < length; left++)
				if (order[left] > order[length])
					break;

			int right = left;
			for (; right < length; right++)
				if (order[right] < order[length])
					break;

			if (right == length)
				return isBackOrderOfATree(Arrays.copyOfRange(order, 0, left),
						left - 1)
						&& isBackOrderOfATree(
								Arrays.copyOfRange(order, left, right), right
										- left - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackOrderOfTree question = new BackOrderOfTree();
		int[] order = { 7, 4, 6, 5 };
		boolean flag = question.isBackOrderOfATree(order, order.length - 1);
		System.out.println(flag);
	}

}
