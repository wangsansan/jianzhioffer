package cn.edu.bjut.offer28;

public class QueenProblem {

	/*
	 * 不同行的皇后不能在同一列，且任意两个皇后不能在同一对角线上
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueenProblem question = new QueenProblem();
		int n = 4;
		int count = question.counOfQueenProblem(n);
		System.out.println(n + "皇后问题共有 "+ count + " 种解法。");
	}

	// 初始化皇后的位置
	// 譬如queens[i] = j,表示第i行的皇后在第j列
	//这种初始化保证了不同皇后不可能在同一行，而对于列值，只进行交换操作，保证了不同皇后不可能在同一列
	public int counOfQueenProblem(int numberOfQueens) {
		if (numberOfQueens < 4)
			return 0;
		else {
			int[] queens = new int[numberOfQueens];
			for (int i = 0; i < numberOfQueens; i++)
				queens[i] = i;

			return countsOfQueenPlace(queens, 0);
		}
	}

	public int countsOfQueenPlace(int[] queens, int index) {
		int count = 0;
		if (index == queens.length - 1) {
			boolean flag = true;
			for (int i = 0; i < queens.length; i++) {
				for (int j = 0; j < queens.length; j++) {
					if (i != j) {
						//判断是否有两个皇后在同一对角线上
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
				count++;
			}
		} else {

			for (int i = index; i < queens.length; i++) {
				swap(queens, index, i);
				count += countsOfQueenPlace(queens, index + 1);
				swap(queens, i, index);
			}
		}

		return count;
	}

	void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
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
