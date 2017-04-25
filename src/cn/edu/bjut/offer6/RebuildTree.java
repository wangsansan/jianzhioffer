package cn.edu.bjut.offer6;

import java.util.Arrays;

public class RebuildTree {

	public Node rebuildTree(int[] front, int[] middle) {
		if(front.length != middle.length)
			return null;
		if(front.length == 0)
			return null;
		Node root = new Node(front[0]);
		int index = findIndexInMiddle(front[0],middle);
		if(index == -1)
			return null;
		int leftChildLength = index;
		int rightChildLength = middle.length - index - 1;
		Node rootLeftChildNode = null;
		if(leftChildLength != 0){
//			此处要注意Arrays.copyOfRange(original,from,to)方法，它只会复制原数组的from下标开始到to-1下标结束包含的数，不包含下标为to的元素
			rootLeftChildNode = rebuildTree(Arrays.copyOfRange(front, 1, leftChildLength + 1),Arrays.copyOfRange(middle, 0, index));
			root.left = rootLeftChildNode;
		}
		Node rootRightChildNode = null;
		if(rightChildLength != 0){
			rootRightChildNode = rebuildTree(Arrays.copyOfRange(front, leftChildLength + 1, front.length),Arrays.copyOfRange(middle, index + 1, middle.length));
			root.right = rootRightChildNode;
		}
		
		return root;
	}
	
	int findIndexInMiddle(int value, int[] middle){
		for(int i = 0; i < middle.length; i++)
			if(middle[i] == value)
				return i;
		
		return -1;
	}
	
	//中序遍历
	public void middlePrint(Node node){
		if(node == null)
			return;
		middlePrint(node.left);
		System.out.print(node.value + " ");
		middlePrint(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] front = {1,2,4,7,3,5,6,8};
		int[] middle = {4,7,2,1,5,3,8,6};
		RebuildTree question = new RebuildTree();
		Node root = question.rebuildTree(front, middle);
		question.middlePrint(root);
	}

}

class Node {
	int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}
}
