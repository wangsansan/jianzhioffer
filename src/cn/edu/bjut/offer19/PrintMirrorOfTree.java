package cn.edu.bjut.offer19;

public class PrintMirrorOfTree {

	public static void main(String[] args) {
		
		PrintMirrorOfTree question = new PrintMirrorOfTree();
		
		Node root1 = new Node(8);
//		Node node11 = new Node(6);
		Node node12 = new Node(10);
//		Node node13 = new Node(5);
//		Node node14 = new Node(7);
		Node node15 = new Node(9);
//		Node node16 = new Node(11);
//		root1.setLeft(node11);
		root1.setRight(node12);
//		node11.setLeft(node13);
//		node11.setRight(node14);
		node12.setLeft(node15);
//		node12.setRight(node16);
		
		question.getMirrorOfTree(root1);
		question.middlePrintTree(root1);
	}
	
	public void getMirrorOfTree(Node root){
		if(root != null){
			Node temp = root.left;
			root.setLeft(root.right);
			root.setRight(temp);
			getMirrorOfTree(root.left);
			getMirrorOfTree(root.right);
		}
	}
	
	public void middlePrintTree(Node node){
		if(node.left != null)
			middlePrintTree(node.left);
		if(node != null)
			System.out.print(node.value + ":");
		if(node.right != null)
			middlePrintTree(node.right);
	}

}



