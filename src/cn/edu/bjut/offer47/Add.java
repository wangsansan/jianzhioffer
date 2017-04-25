package cn.edu.bjut.offer47;

public class Add {

	public static void main(String[] args){
		Add question = new Add();
		int m = 54, n = 76;
		int ret = question.add(m, n);
		System.out.println(ret + ":" + question.add2(m, n));
	}
	
	//这个算法有问题，add2是正确的。
	public int add(int m, int n){
		int first = m & n;
		int second = m ^ n;
		int ret = (first << 1) ^ second;
		return ret;
	}
	
	public int add2(int m, int n){

		int ret = 0;
		int carry = 0;
		do{
			ret = m ^ n;
			carry = (m & n) << 1;
			
			m = ret;
			n = carry;
		}while(carry != 0);
		
		return ret;
	}
	
}
