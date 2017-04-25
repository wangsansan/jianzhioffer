package cn.edu.bjut.sorts;

public class QuickSort {

	public void quickSort(int[] array, int start, int end) {
		if (array == null)
			return;
		if (array.length <= 1)
			return;
		if (start < 0 || end <= start || end >= array.length)
			return;
		int i = start;
		int j = end;
		int temp = array[start];
		while (i < j) {
			while (i < j && array[j] >= temp) {
				j--;
			}
			if (i < j) {
				array[i] = array[j];
				i++;
			}

			while (i < j && array[i] <= temp) {
				i++;
			}
			if (i < j) {
				array[j] = array[i];
				j--;
			}
		}

		if (i == j)
			array[i] = temp;

		quickSort(array, start, i - 1);
		quickSort(array, i + 1, end);
	}

	public static void main(String[] args) {
		int[] array = {3,7,1,9,4,8,5};
		QuickSort question = new QuickSort();
		question.quickSort(array, 0, array.length - 1);
		for(int i : array)
			System.out.print(i + " ");
	}

}
