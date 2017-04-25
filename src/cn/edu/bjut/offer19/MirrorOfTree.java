package cn.edu.bjut.offer19;


public class MirrorOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorOfTree question = new MirrorOfTree();
		
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
		
		Node root2 = new Node(8);
		Node node21 = new Node(6);
		Node node22 = new Node(10);
		Node node23 = new Node(5);
		Node node24 = new Node(7);
		Node node25 = new Node(8);
		Node node26 = new Node(11);
		root2.setLeft(node22);
		root2.setRight(node21);
		node21.setLeft(node24);
		node21.setRight(node23);
		node22.setLeft(node26);
		node22.setRight(node25);
		
		boolean flag = question.isMorror(root1, root2);
		System.out.println(flag);
	}

	boolean isMorror(Node root1, Node root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.value == root2.value)
				result = mirrorChild(root1.left, root2.right);
		}
		return result;
	}

	boolean mirrorChild(Node root1, Node root2) {

		if (root1 == null && root2 == null)
			return true;
		
		if(root1 == null && root2 != null)
			return false;
		
		if(root2 == null && root1 != null)
			return false;

		if (root1.value != root2.value)
			return false;
		return mirrorChild(root1.left, root2.right)
				&& mirrorChild(root1.right, root2.left);
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
