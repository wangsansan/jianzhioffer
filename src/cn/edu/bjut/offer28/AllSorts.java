package cn.edu.bjut.offer28;

public class AllSorts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSorts question = new AllSorts();
		question.printAllSorts("abcd");
	}

	void printAllSorts(String str) {
		if (str == null || str.length() == 0)
			return;
		char[] chars = str.toCharArray();
		printAllSorts(chars, 0);
	}

	void printAllSorts(char[] chars, int index) {
		if (index == chars.length - 1)
			System.out.print(new String(chars) + " ");
		else {
			for (int j = index; j < chars.length; j++) {
				swap(chars, index, j);
				printAllSorts(chars, index + 1);
				swap(chars, j, index);
			}
		}
	}

	void swap(char[] chars, int index1, int index2) {
		char temp = chars[index1];
		chars[index1] = chars[index2];
		chars[index2] = temp;
	}

}
