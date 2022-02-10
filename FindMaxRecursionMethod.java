package tree;

public class FindMaxRecursionMethod {
	public static int maxRecursion(Node root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		return Math.max(root.key,Math.max(maxRecursion(root.left),maxRecursion(root.right)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root =new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
		root.left.left=new Node(40);
		root.left.right=new Node(50);
		root.right.left=new Node(60);
		root.right.right=new Node(70);
		root.left.left.left=new Node(80);
		root.left.left.right=new Node(90);
		root.left.right.left=new Node(100);
		root.left.right.right=new Node(200);
		int max=maxRecursion(root);
		System.out.println("The maximum element in tree is: "+max);

	}

}
