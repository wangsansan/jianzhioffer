package cn.edu.bjut.offer5;


public class PrintList {

	static Node node1 = new Node(1);
	{
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
	}

	public void printListBack(Node node) {
		if (node != null) {
			StringBuilder sb = new StringBuilder();
			printListBackReally(node, sb);
		}
	}

	private void printListBackReally(Node node, StringBuilder sb) {
		if (node.getNext() == null) {
			sb.append(node.getValue());
			System.out.println(sb.reverse());
		} else {
			sb.append(node.getValue());
			printListBackReally(node.getNext(), sb);
		}
	}

	void printListBack2(Node node) {//这个方法好，跟我上面的方法虽然思路一致，但是简洁多了，剑指offer上的
		if(node != null){
			if(node.getNext() != null)
				printListBack2(node.getNext());
		
			System.out.print(node.getValue() + " " );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintList question = new PrintList();
		question.printListBack2(node1);
	}

}

class Node {
	int value;
	Node next;

	Node() {

	}

	Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
