package cn.edu.bjut.offer35;

public class FirstOccurOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdabcea";
		FirstOccurOnce question = new FirstOccurOnce();
		char c = question.getFirstOccurOnce(str);
		System.out.println(c);
	}
	
	public char getFirstOccurOnce(String str){
		if(str == null || str.trim() == "")
			throw new RuntimeException();
		char ret = ' ';
		char[] chars = str.toCharArray();
		int[] hash = new int[26];
		for(int i = 0; i < 26; i++)
			hash[i] = 0;
		for(char c:chars)
			hash[c-'a']++;
		for(char c:chars){
			if(hash[c - 'a'] == 1){
				ret = c;
				break;
			}
		}
		
		return ret;
	}

}
