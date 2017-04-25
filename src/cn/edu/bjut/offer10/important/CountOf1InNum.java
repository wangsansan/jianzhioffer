package cn.edu.bjut.offer10.important;

public class CountOf1InNum {

	public static void main(String[] args) {
		CountOf1InNum question = new CountOf1InNum();
		System.out.println(question.countOf1(10));
		System.out.println(question.secondCountOf1(10));
	}

	/*
	 * 把一个整数减去1再与原整数做与运算，就会把原整数二进制形式最右边的1消除掉，那其
	 * 二进制中有n位1，就可以进行n次该运算
	 */
	public int countOf1(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num & (num - 1);
		}

		return count;
	}
	
	/*
	 * 将原整数与flag：1做与运算，只要不等于0，就说明该bit为1，然后将flag左移，继续与原整数做与运算
	 * 直至flag左移之后超出int类型表示范围。
	 * 该方法与上面解法比较，效率较差，因为该方法无论原整数二进制形式有多少位1，都需要进行32次比较，而上述
	 * 方法1，是有几位1，进行几次运算！
	 */
	public int secondCountOf1(int num) {
		int count = 0;
		
		int flag = 1;
		while(flag != 0){
			if((num & flag) != 0)
				count++;
			flag = flag << 1;
		}
		
		return count;
	}

}
