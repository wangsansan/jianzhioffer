package cn.edu.bjut.offer20;

public class PrintArrayByClockwise {

	public static void main(String[] args) {
		int[][] array = { { 1, 2 }, { 3, 4 } };

		PrintArrayByClockwise question = new PrintArrayByClockwise();
		question.printArrayByClockwise(array);
	}

	void printArrayByClockwise(int[][] array) {
		if (array == null)
			return;
		int startX = 0;
		int startY = 0;
		int endX = array.length - 1;
		int endY = array[0].length - 1;
		printArray(array, startX, startY, endX, endY);
	}

	void printArray(int[][] array, int startX, int startY, int endX, int endY) {

		if (endX < 0 || endY < 0 || startX > endX || startY > endY)
			return;

		if (endX >= startX)
			for (int j = startY; j <= endY; j++)
				System.out.print(array[startX][j] + " ");

		if (endY >= startY)
			for (int i = startX + 1; i <= endX; i++)
				System.out.print(array[i][endY] + " ");

		if (endX > startX)
			for (int j = endY - 1; j >= startY; j--)
				System.out.print(array[endX][j] + " ");

		if (endY > startY)
			for (int i = endX - 1; i > startX; i--)
				System.out.print(array[i][startY] + " ");

		startX++;
		endX--;
		startY++;
		endY--;

		printArray(array, startX, startY, endX, endY);
	}

}
