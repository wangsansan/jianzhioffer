package cn.edu.bjut.offer28;


public class EightQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queens = { 0, 1, 2, 3 };
		EightQueens question = new EightQueens();
		StringBuilder sb = new StringBuilder("");
		question.countsOfPlace(queens, 0, sb);
		System.out.println(sb.length());
	}

	public void countsOfPlace(int[] queens, int index, StringBuilder cos) {
		if (index == queens.length - 1) {
			boolean flag = true;
			for (int i = 0; i < queens.length; i++) {
				for (int j = 0; j < queens.length; j++) {
					if (i != j) {
						if (i - j == queens[i] - queens[j]
								|| j - i == queens[i] - queens[j]) {
							flag = false;
							break;
						}
					}
				}
				if (!flag)
					break;
			}

			if (flag) {
				printQueens(queens);
				cos.append("0");
			}
		}

		for (int i = index; i < queens.length; i++) {
			swap(queens, index, i);
			countsOfPlace(queens, index + 1, cos);
			swap(queens, i, index);
		}

	}

	void swap(int[] chars, int index1, int index2) {
		int temp = chars[index1];
		chars[index1] = chars[index2];
		chars[index2] = temp;
	}

	void printQueens(int[] queens) {
		for (int i = 0; i < queens.length; i++) {
			for (int j = 0; j < queens[i]; j++) {
				System.out.print("*");
			}
			System.out.println("Q");
		}
		System.out.println("========================");
	}

}