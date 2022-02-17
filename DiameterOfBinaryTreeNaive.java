package tree;

public class DiameterOfBinaryTreeNaive {
	static int max=0;
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int lt=height(root.left);
		int rt=height(root.right);
		max=Math.max(max, rt+lt+1);
		return 1+Math.max(rt,lt);
	}
	public static int diameter(Node root)
	{
		height(root);
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(5);
		root.left=new Node(-10);
		root.right=new Node(3);
		root.left.left=new Node(9);
		root.left.right=new Node(8);
		root.right.left=new Node(-4);
		root.right.right=new Node(7);
		int count=diameter(root);
		System.out.println("The diameter of tree is: "+count);

	}

}
