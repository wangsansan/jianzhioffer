package cn.edu.bjut.offer4;

public class ReplaceTheBlank {
	
	public char[] replaceTheBlankOfTheStr(char[] str){
		int length = str.length;
		int countOfBlank = 0;
		for(char c: str){
			if(c == ' ')
				countOfBlank++;
		}
		char[] retStr = new char[length + countOfBlank * 2];
		int j = retStr.length - 1;
		int i = length - 1;
		while(i >= 0){//此处判断条件要加上&& j > i 么？
			if(str[i] == ' '){
				retStr[j--] = '%';
				retStr[j--] = '0';
				retStr[j--] = '2';
				i--;
			}else{
				retStr[j--] = str[i--];
			}
		}
		return retStr;
	}
	
	public static void main(String[] args){
		ReplaceTheBlank rtb = new ReplaceTheBlank();
		System.out.println(rtb.replaceTheBlankOfTheStr("we are happy".toCharArray()));
	}
	
}
