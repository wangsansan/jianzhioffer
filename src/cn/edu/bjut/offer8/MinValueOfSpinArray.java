package cn.edu.bjut.offer8;

public class MinValueOfSpinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		System.out.println(new MinValueOfSpinArray().getMinValueFromSpinArray(array, 0, array.length - 1));
	}
	
	public int getMinValueFromSpinArray(int[] array, int start, int end){
		if(array[end] > array[start])
			return array[start];
		int mid = start / 2 + end / 2;
		if(array[start] == array[mid] && array[mid] == array[end])
			return getMinValueFromArray(array);
		if(array[mid] > array[end]){
			start = mid + 1;
			return getMinValueFromSpinArray(array, start, end);
		}else{
			end = mid;
			return  getMinValueFromSpinArray(array, start, end);
		}
	}
	
	int getMinValueFromArray(int[] array){
		int min = array[0];
		for(int i : array)
			if( i < min)
				min = i;
		return min;
	}

}
