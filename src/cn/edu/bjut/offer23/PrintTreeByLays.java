package cn.edu.bjut.offer23;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeByLays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root1 = new Node(8);
		Node node11 = new Node(6);
		Node node12 = new Node(10);
		Node node13 = new Node(5);
		Node node14 = new Node(7);
		Node node15 = new Node(8);
		Node node16 = new Node(11);
		root1.setLeft(node11);
		root1.setRight(node12);
		node11.setLeft(node13);
		node11.setRight(node14);
		node12.setLeft(node15);
		node12.setRight(node16);
		
		PrintTreeByLays question = new PrintTreeByLays();
		question.printTreeByUpDownLays(root1);
	}
	
	void printTreeByUpDownLays(Node root){
		if(root == null)
			return;
		//利用队列先进先出的特性，在删除某一个节点时，将其左右孩子加入到队列中
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		//循环停止条件是队列中没有节点
		while(nodes.size() != 0){
			Node toRemove = nodes.remove();
			if(toRemove.left != null)
				nodes.add(toRemove.left);
			if(toRemove.right != null)
				nodes.add(toRemove.right);
			System.out.print(toRemove.value + " ");
		}
	}

}

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
