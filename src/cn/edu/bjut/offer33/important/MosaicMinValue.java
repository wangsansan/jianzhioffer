package cn.edu.bjut.offer33.important;

public class MosaicMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,32,321};
		MosaicMinValue question = new MosaicMinValue();
		String ret = question.minValueOfArrayMosaic(nums);
		System.out.println(ret);
	}

	public String minValueOfArrayMosaic(int[] nums) {
		if (nums != null) {
			boolean flag = true;
			for (int i = 0; i < nums.length; i++) {
				if (!flag) {
					break;
				}
				flag = false;
				for (int j = 0; j < nums.length - i - 1; j++) {
					if (compareTwoIntByString(nums[j], nums[j + 1]) > 0) {
						swap(nums, j, j + 1);
						flag = true;
					}
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int num: nums)
				sb.append(num);
			
			return sb.toString();
		} else {
			throw new NullPointerException();
		}
	}

	//比较规则为：如果m和n拼接起来mn>=nm，即认为m>n,反之n<m
	public int compareTwoIntByString(int value1, int value2) {
		String v1 = String.valueOf(value1);
		String v2 = String.valueOf(value2);

		return (v1 + v2).compareTo(v2 + v1);
	}

	public void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
