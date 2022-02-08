package tree;

class MyNode{
	int key;
	MyNode left;
	MyNode right;
	MyNode(int x)
	{
		key=x;
		left=null;
		right=null;
	}
}

public class LengthOfTree {
	public static int height(MyNode root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(height(root.left), height(root.right))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode root=new MyNode(10);
		root.left=new MyNode(20);
		root.right=new MyNode(30);
		root.left.left=new MyNode(40);
		root.left.right=new MyNode(50);
		root.right.left=new MyNode(60);
		root.right.right=new MyNode(70);
		root.left.left.left=new MyNode(80);
		root.left.left.right=new MyNode(90);
		int len=height(root);
		System.out.println("the height of tree is: "+len);

	}

}
