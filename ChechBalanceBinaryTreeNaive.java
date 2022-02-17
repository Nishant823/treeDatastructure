package tree;


public class ChechBalanceBinaryTreeNaive {
	public static int Height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+Math.max(Height(root.left),Height(root.right));
	}
	public static boolean checkBalanceBinary(Node root)
	{
		if(root==null)
		{
			return true;
		}
		int lh=Height(root.left);
		int rh=Height(root.right);
		if(Math.abs(rh-lh)>1)
		{
			return false;
		}
		boolean left=checkBalanceBinary(root.left);
		boolean right=checkBalanceBinary(root.right);
		if(!left==!right)
		{
			return false;
		}
		return true;
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
		boolean check=checkBalanceBinary(root);
		if(check)
		{
			System.out.println("The tree is balanced");
		}
		else
		{
			System.out.println("This tree is not balanced");
		}

	}

}
