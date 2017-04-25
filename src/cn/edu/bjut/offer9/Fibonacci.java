package cn.edu.bjut.offer9;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci quetion = new Fibonacci();
		int num = 10000;
		System.out.println(quetion.getFibonacci(num));
	}

	int getFibonacci(int num) {
		if (num < 0)
			return -1;
		int value[] = { 0, 1 };
		if (num <= 1)
			return value[num];
		int first = 0;
		int second = 1;
		int retValue = -1;
		for (int i = 2; i < num; i++) {
			retValue = first + second;
			first = second;
			second = retValue;
		}

		return retValue;
	}

}
