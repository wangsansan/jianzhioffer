package cn.edu.bjut.offer42;

public class ExchangeCharOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExchangeCharOrder question = new ExchangeCharOrder();
		String str = "I have a dream!";
		question.exchange2(str);
	}

	public void exchange(String str) {
		String[] strs = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = strs.length - 1; i >= 0; i--) {
			sb.append(strs[i] + " ");
		}
		System.out.println(sb.toString().trim());
	}

	public void exchange2(String str) {
		char[] mainChars = exchangeForexchange2(str.toCharArray(), 0,
				str.length() - 1);
		// System.out.println(new String(mainChars));
		int index1 = 0;
		for (int i = 0; i < mainChars.length; i++) {
			if (mainChars[i] == ' ') {
				exchangeForexchange2(mainChars, index1, i - 1);
				index1 = i + 1;
			}
		}

		System.out.println(new String(mainChars));
	}

	public char[] exchangeForexchange2(char[] chars, int index1, int index2) {
		if (chars == null || index1 < 0 || index2 >= chars.length)
			throw new RuntimeException("error");
		while (index1 < index2 && index1 < chars.length && index2 >= 0) {
			char temp = chars[index1];
			chars[index1] = chars[index2];
			chars[index2] = temp;
			index1++;
			index2--;
		}

		return chars;
	}

}
