package tree;
class Node{
	int key;
	Node left;
	Node right;
	Node(int x)
	{
		key=x;
		left=null;
		right=null;
	}
}

public class ImplementingTreeUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		System.out.println(root.left.right.key);

	}

}
