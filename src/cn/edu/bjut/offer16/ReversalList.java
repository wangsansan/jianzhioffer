package cn.edu.bjut.offer16;

public class ReversalList {

	/*
	 * 自己写的反转链表，虽然能够实现反转，但是却没法返回正确的节点
	 */
	public Node reversalList(Node node) {
		if (node.next == null)
			return node;
		Node nextNode = reversalList(node.next);
		nextNode.next = node;
		node.next = null;
		return node;
	}
	
	public Node reversalList3(Node node) {
		Node retNode = null;
		while(node != null){
			Node nextNode = node.next;
			nextNode.next = node;
			node = nextNode;
			/*
			 * node.next = pre;
			pre = node;
			 */
		}
		return retNode;
	}
	
	public Node reversalList2(Node node) {
		Node retNode = null;
		Node preNode = null;
		while(node != null){
			Node nextNode = node.next;
			node.next = preNode;
			if(nextNode == null){//判断条件很重要
				retNode = node;
			}
			/*
			 * 下面两句的顺序很重要
			 */
			preNode = node;
			node = nextNode;
		}
		return retNode;
	}

	public void printList(Node node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		printList(node.next);
	}

	public static void main(String[] args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		ReversalList question = new ReversalList();
		question.printList(node1);
		Node node = question.reversalList2(node1);
		question.printList(node);
	}
}

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}