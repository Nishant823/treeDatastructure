package tree;


public class CountSubTreeWithGivenSum {
	static int count=0;
	public static int countSubTree(Node root,int sum)
	{
		if(root==null)
		{
			return 0;
		}
		int left=countSubTree(root.left,sum);
		int right=countSubTree(root.right,sum);
		if(sum==left+right+root.key)
		{
			count++;
		}
		return root.key+left+right;
		
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
		int sum=7;
		countSubTree(root,sum);
		System.out.println(count);

	}

}
