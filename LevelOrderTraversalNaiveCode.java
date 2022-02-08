package tree;

public class LevelOrderTraversalNaiveCode {
	public static int height(Node root)
	{
		if(root==null)
			return 0;
		return Math.max(height(root.left),height(root.right))+1;
	}
	public static void print(Node root,int k)
	{
		if(root==null)
		{
			return ;
		}
		if(k==0)
		{
			System.out.print(root.key+" ");
		}
		else
		{
			print(root.left,k-1);
			print(root.right,k-1);
		}
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
		int height=height(root);
		for(int i=0;i<height;i++)
		{
			print(root,i);
		}

	}

}
