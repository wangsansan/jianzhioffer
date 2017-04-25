package cn.edu.bjut.offer38;

public class TimesOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimesOfK question = new TimesOfK();
		int[] array = { 3, 3, 3, 3, 3, 3 };
		int k = 3;
		int index1 = question.getFirstK(array, 0, array.length - 1, k);
		int index2 = question.getLastK(array, 0, array.length - 1, k);
		System.out.println("index1:" + index1 + ";index2:" + index2 + ";times:"
				+ (index2 - index1 + 1));
	}

	int getFirstK(int[] array, int index1, int index2, int k) {
		if (array == null || index1 > array.length || index2 > array.length)
			throw new RuntimeException("canShu exception");

		int ret = -1;

		int mid = (index1 + index2) / 2;

		if (array[mid] >= k) {
			if (array[mid] == k) {
				if (mid == index1 || array[mid - 1] != k)
					ret = mid;
				else
					return getFirstK(array, index1, mid - 1, k);
			} else {
				return getFirstK(array, index1, mid - 1, k);
			}
		} else {
			return getFirstK(array, mid + 1, index2, k);
		}

		return ret;
	}

	int getLastK(int[] array, int index1, int index2, int k) {
		if (array == null || index1 > array.length || index2 > array.length)
			throw new RuntimeException("canShu exception");

		int ret = -1;

		int mid = (index1 + index2) / 2;

		if (array[mid] <= k) {
			if (array[mid] == k) {
				if (mid == index2 || array[mid + 1] != k)
					ret = mid;
				else
					return getLastK(array, mid + 1, index2, k);
			} else {
				return getLastK(array, mid + 1, index2, k);
			}
		} else {
			return getLastK(array, index1, mid - 1, k);
		}

		return ret;
	}

}
