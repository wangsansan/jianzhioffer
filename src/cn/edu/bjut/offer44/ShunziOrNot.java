package cn.edu.bjut.offer44;

import java.util.Arrays;

public class ShunziOrNot {

	public static void main(String[] args) {
		ShunziOrNot question = new ShunziOrNot();
		int[] values = {1,4,5,0,0};
		boolean flag = question.isAPair(values);
		System.out.println(flag);
	}

	boolean isAPair(int[] array) {
		boolean flag = false;
		if (array != null) {
			Arrays.sort(array);
			int kingCount = 0;
			int value = 0;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] < 0) {
					return false;
				} else {
					if (array[i] == 0) {
						kingCount++;
					} else {
						int tempValue = array[i + 1] - array[i] - 1;
						if (tempValue == -1) {
							return false;
						} else {
							value += tempValue;
						}
					}
				}
			}
			
			if (array[array.length - 1] < 0)
				return false;

			if (array[array.length - 1] == 0)
				kingCount++;

			if(kingCount > 2)
				throw new RuntimeException("一副牌大小王数量怎么可能超过两张");
			
			//判断是否是顺子的语句很重要
			if (value <= kingCount)
				flag = true;

		}
		return flag;
	}
}
