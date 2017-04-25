package cn.edu.bjut.offer28;

import java.util.LinkedList;
import java.util.List;


public class TestFunctionCanShu {

	public static void main(String[] args) {
		
		TestFunctionCanShu question = new TestFunctionCanShu();
		
		Integer cos = new Integer(0);
		question.testIntegerAsCanShu(cos);
		System.out.println(cos.intValue());

		String cosString = "123";
		question.testStringAsCanShu(cosString);
		System.out.println(cosString);
		
		StringBuilder sb = new StringBuilder("123");
		question.testStringBuilderAsCanShu(sb);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("123");
		question.testStringBufferAsCanShu(sb2);
		System.out.println(sb2);

		List<Object> list = new LinkedList<>();
		question.testListAsCanShu(list);
		System.out.println(list);
		
		Node node = new Node(0);
		question.testSelfClassAsCanShu(node);
		System.out.println(node.value);
		
		int[] array = new int[4];
		question.testArrayAsCanShu(array);
		System.out.println(array[array.length - 1]);
	}

	public void testIntegerAsCanShu(Integer i) {
		/*
		 * 此处我认为可能是因为i++操作导致i被解封装导致i变为int类型
		 * 所以形参也指向为不同的值了
		 */
		i++;
	}

	public void testStringAsCanShu(String str) {
		/* 因为String是不可变常量，
		 * 所以其实函数内复制引用（形参）指向的是另一段String常量，
		 * 而实参还是指向的是之前的String常量 */
		str += "word";
	}
	
	public void testStringBuilderAsCanShu(StringBuilder sb) {
//		sb = new StringBuilder("new String");
		/*
		 * 形参和实参指向的是同一个对象，所以改变此对象有效
		 */
		sb.append("world");
	}
	
	public void testStringBufferAsCanShu(StringBuffer sb) {
		/*
		 * 形参指向了另一个对象，对于实参来说没有影响
		 */
		sb = new StringBuffer("new String");
	}

	public void testListAsCanShu(List list) {
		 /*
		 * 形参和实参指向的是同一个对象，所以改变此对象有效
		 */
		list.add(new Object());
	}
	
	public void testSelfClassAsCanShu(Node node) {
		/*
		 * 形参和实参指向的是同一个对象，所以改变此对象有效
		 */
		node.value = 4;
	}
	
	public void testArrayAsCanShu(int[] array) {
		/*
		 * 形参和实参指向的是同一个对象，所以改变此对象有效
		 */
		for(int i = 0; i < array.length; i++)
			array[i] = i;
	}

}

class Node {
	int value;

	Node(int value) {
		this.value = value;
	}
}
