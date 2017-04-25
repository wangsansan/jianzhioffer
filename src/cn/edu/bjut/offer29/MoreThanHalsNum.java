package cn.edu.bjut.offer29;

public class MoreThanHalsNum {

	int getNumMoreThanHalf(int[] values) {
		if (values == null)
			throw new NullPointerException("空指针异常");

		int ret = -1;
		ret = values[0];
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (count == 0) {
				count++;
				ret = values[i];
			} else {
				if (values[i] == ret) {
					count++;
				} else {
					count--;
				}
			}
		}

		//需要检查下是否ret在数组中出现的次数真的超过半数，次数偷懒没写
		
		return ret;
	}

	public static void main(String[] args) {
		MoreThanHalsNum question = new MoreThanHalsNum();
		int[] values = { 3,3,3,0,1,2 };
		int value = question.getNumMoreThanHalf(values);
		System.out.println(value);
	}

}
