package cn.edu.bjut.offer30;

import java.util.Arrays;


public class MinKValues {

	private int[] orgnizeMinKValues(int[] values, int k){
		if(values == null || k <= 0)
			return null;
		if(k >= values.length)
			return values;
		int[] ret = new int[k];
		
		ret = Arrays.copyOf(values, k);
		
		for(int i = k; i < values.length; i++){
			if(values[i] < maxValueInArray(ret)){
				ret[indexOfMaxValue(ret)] = values[i];
			}
		}
		return ret;
	}
	
	int maxValueInArray(int[] array){
		if(array == null)
			throw new NullPointerException("array is null");
		int max = array[0];
		for(int i = 1; i < array.length; i++)
			if(array[i] > max)
				max = array[i];
		
		return max;
	}
	
	int indexOfMaxValue(int[] array){
		if(array == null)
			throw new NullPointerException("array is null");
		int index = 0;
		for(int i = 1; i < array.length; i++)
			if(array[i] > array[index])
				index = i;
		
		return index;
	}
	
	public static void main(String[] args) {
		MinKValues question = new MinKValues();
		int[] values = {5,4,3,2,1,0};
		int[] ret = question.orgnizeMinKValues(values, 3);
		for(int i:ret)
			System.out.print(i + " ");
	}

}
