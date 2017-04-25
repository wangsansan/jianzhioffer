package cn.edu.bjut.offer17;

public class Merge {

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node12 = new Node(12);
		node1.next = node3;
		node2.next = node4;
		node3.next = node5;
		node4.next = node6;
		node5.next = node7;
		node6.next = node8;
		node7.next = node9;
		node8.next = node10;
		node9.next = node11;
		node11.next = node12;

		Merge question = new Merge();
		Node node = question.mergeList2(node1, node2);
		question.printList(node);
	}

	public void printList(Node node) {
		if (node == null)
			return;
		System.out.print(node.value + " ");
		printList(node.next);
	}

	public Node mergeList(Node node1, Node node2) {
		if (node1 == null)
			return node2;
		if (node2 == null)
			return node1;
		Node head = null;
		// 找到头节点
		if (node1.value <= node2.value) {
			head = node1;
			node1 = node1.next;
		} else {
			head = node2;
			node2 = node2.next;
		}
		Node tail = head;
		// 两条节点链相互比较，拼接
		while (node1 != null && node2 != null) {
			if (node1.value <= node2.value) {
				tail.next = node1;
				node1 = node1.next;
			} else {
				tail.next = node2;
				node2 = node2.next;
			}
			tail = tail.next;
		}
		// 将剩余的节点，直接接在后面
		if (node1 == null)
			tail.next = node2;
		if (node2 == null)
			tail.next = node1;

		return head;
	}

	// 剑指offer上的递归解法，代码量更简洁
	public Node mergeList2(Node node1, Node node2) {
		if (node1 == null)
			return node2;
		if (node2 == null)
			return node1;
		Node head = null;
		if (node1.value <= node2.value) {
			head = node1;
			node1 = node1.next;
		} else {
			head = node2;
			node2 = node2.next;
		}
		head.next = mergeList(node1, node2);

		return head;
	}

}

class Node {
	int value;
	Node next;

	Node(int value) {
		this.value = value;
	}
}
