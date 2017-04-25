package cn.edu.bjut.offer41;

public class Question2 {
	
	public static void main(String[] args){
		Question2 question = new Question2();
		int value = 15;
		question.printSerisNum(value);
	}

	public void printSerisNum(int value){
		int start = 1;
		for(int i = 2; i <= (value + 1) / 2; i++){
			if(i == start)
				continue;
			int temp = getSerisValue(start, i);
			if( temp >= value){
				if(temp == value)
					System.out.println(start + "~" + i);
				start++;
				i = start;
			}
		}
	}
	
	public int getSerisValue(int i, int j){
		if(i >= j)
			throw new RuntimeException("illegal");
		int ret = 0;
		for(int k = i;k <= j; k++)
			ret += k;
		
		return ret;
	}
	
}
