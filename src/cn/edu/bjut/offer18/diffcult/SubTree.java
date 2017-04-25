package cn.edu.bjut.offer18.diffcult;

public class SubTree {

	boolean hasSubTree(Node root1, Node root2) {

		boolean result = false;

		if (root1 != null && root2 != null) {
			if (root1.value == root2.value)
				result = doesHaveTree2(root1, root2);
			if (!result) {
				if (root1.left != null)
					return hasSubTree(root1.left, root2);
				if (root1.right != null)
					return hasSubTree(root1.right, root2);
			}
		}
		return result;
	}

	boolean doesHaveTree2(Node root1, Node root2) {
		if (root2 == null)//这个判断条件很重要
			return true;
		if (root1 == null)
			return false;
		if (root1.value != root2.value)
			return false;

		return doesHaveTree2(root1.left, root2.left)
				&& doesHaveTree2(root1.right, root2.right);
	}

	public static void main(String[] args) {
		SubTree question = new SubTree();
		Node root1 = new Node(8);
		Node node11 = new Node(8);
		Node node12 = new Node(7);
		Node node13 = new Node(9);
		Node node14 = new Node(2);
		Node node15 = new Node(4);
		Node node16 = new Node(7);
		root1.setLeft(node11);
		root1.setRight(node12);
		node11.setLeft(node13);
		node11.setRight(node14);
		node14.setLeft(node15);
		node14.setRight(node16);

		Node root2 = new Node(8);
		Node node21 = new Node(9);
		Node node22 = new Node(2);
		root2.setLeft(node21);
		root2.setRight(node22);

		boolean flag = question.hasSubTree(root1, root2);
		System.out.println(flag);
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
