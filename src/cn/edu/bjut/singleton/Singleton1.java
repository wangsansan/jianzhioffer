package cn.edu.bjut.singleton;

public class Singleton1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static Singleton1 instance = new Singleton1();

	public static Singleton1 getInstance() {
		return instance;
	}

	private Singleton1() {
		// TODO Auto-generated constructor stub
	}
}
