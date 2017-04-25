package cn.edu.bjut.offer42;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 question = new Question2();
		String str = "abcdefg";
		int k = 2;
		question.leftSpin(str, k);
	}

	public void leftSpin(String str, int k) {
		ExchangeCharOrder exchange = new ExchangeCharOrder();
		char[] mainChars = exchange.exchangeForexchange2(str.toCharArray(), 0,
				str.length() - 1);
		exchange.exchangeForexchange2(mainChars, 0, str.length() - 1 - k);
		exchange.exchangeForexchange2(mainChars, str.length() - k,
				str.length() - 1);

		System.out.println(new String(mainChars));
	}

}
