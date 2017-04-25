package cn.edu.bjut.offer25.diffcult;

import java.util.Stack;

public class RoadOfTree {

	public void printRoadsOfValueInTree(Node root, int value) {
		if (root == null)
			return;

		Stack<Node> path = new Stack<>();
		int temp = 0;
		printRoadsOfValueInTree(root, value, path, temp);
	}

	public void printRoadsOfValueInTree(Node root, int value, Stack<Node> path,
			int temp) {
		temp += root.value;
		path.push(root);
		boolean isLeaf = (root.left == null && root.right == null) ? true
				: false;
		if (temp == value && isLeaf) {
			//如果值为value且是叶子节点，则输出当前路径
			printPath(path);
		} else {
			if (temp < value && !isLeaf) {
				//如果不为叶子节点，且当前的值是小于value的，那就递归
				if (root.left != null)
					printRoadsOfValueInTree(root.left, value, path, temp);
				if (root.right != null)
					printRoadsOfValueInTree(root.right, value, path, temp);
			}
			//其实这句是没有用的，因为当前值设定的是基本类型，所以不会对上一层的当前值有影响，
			//若是当前值不为value，那同时也没有意义
//			temp -= root.value;
		}
		//不管当前节点是否是需要的那个节点，运行完毕后都弹出，方便查找其他路径
		path.pop();
	}

	void printPath(Stack<Node> path) {
		System.out.println("path================:");
		for (int i = 0; i < path.size(); i++)
			System.out.print(path.get(i).value + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		Node root1 = new Node(5);
		Node root2 = new Node(12);
		Node root3 = new Node(4);
		Node root4 = new Node(7);
		root.setLeft(root1);
		root.setRight(root2);
		root1.setLeft(root3);
		root1.setRight(root4);
		root3.setRight(new Node(3));

		RoadOfTree question = new RoadOfTree();
		int value = 22;
		question.printRoadsOfValueInTree(root, value);
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
