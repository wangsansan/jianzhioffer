package cn.edu.bjut.offer31;

public class SeriMax {

	//我的写法，不如书上写法，见下方
	public int getSerisMaxValue(int[] values) {
		if (values != null) {
			int currentValue = Integer.MIN_VALUE;
			int maxValue = Integer.MIN_VALUE;
			for (int i : values) {
				if (i < 0) {
					if (currentValue > maxValue) {
						maxValue = currentValue;
						currentValue += i;
					} else {
						currentValue = i;
					}
				} else {
					if (currentValue <= 0){
						currentValue = i;
					}else{
						currentValue += i;
					}
				}
			}
			return maxValue;
		} else
			throw new NullPointerException();
	}
	
	//书上写法
	public int getSerisMaxValue2(int[] values) {
		if (values != null) {
			int currentValue = Integer.MIN_VALUE;
			int maxValue = Integer.MIN_VALUE;
			for (int i : values) {
				if(currentValue <= 0)
					currentValue = i;
				else
					currentValue += i;
				
				if(currentValue > maxValue)
					maxValue = currentValue;
			}
			return maxValue;
		} else
			throw new NullPointerException();
	}
	
	public static void main(String[] args){
		SeriMax question = new SeriMax();
		int[] values = {-1,-2,-3,-4,-5};
		int value = question.getSerisMaxValue2(values);
		System.out.println(value);
	}

}
