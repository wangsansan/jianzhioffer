package cn.edu.bjut.offer40;


public class TwoOnlyOnceNum {

	public static void main(String[] args){
		TwoOnlyOnceNum question = new TwoOnlyOnceNum();
		int[] array = {1,1,2,2,3,3,4,5};
		question.printTwoNums(array);
//		short s1 = 1; s1 = s1 + 1;
		short s1 = 1; s1 += 1;
	}
	
	
	public void printTwoNums(int[] array){
		if(array == null)
			return;
		int temp = 0;
		for(int i = 0; i <  array.length; i++){
			temp ^= array[i];
		}
		
		int bit1 = findFirstBit1(temp);
		
		int num1 = 0, num2 = 0;
		
		for(int i = 0; i <  array.length; i++){
			if(isBit1(array[i],bit1)){
				num1 ^= array[i];
			}else{
				num2 ^= array[i];
			}
		}
		
		System.out.println("num1:" + num1 + ";num2:" + num2);
		
	}
	
	int findFirstBit1(int num){
		int ret = 0;
		while((num & 1) != 1){
			num >>= 1;
			ret++;
		}
		return ret;
	}
	
	boolean isBit1(int num, int bit1){
		num >>= bit1;
		return (num & 1) == 1?true:false;
	}
}
