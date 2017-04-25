package cn.edu.bjut.singleton;

public class Test {
	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton12 = Singleton1.getInstance();
		singleton1.setName("wang");
		System.out.println(singleton12.getName());
	}
}
