package tree;
import java.util.Stack;

public class IterativePreOrderTraversal {
	public static void preOrderTraversal(Node root)
	{
		Stack<Node>stack=new Stack<Node>();
		Node curr=root;
		while(curr!=null||stack.isEmpty()==false)
		{
			while(curr!=null)
			{
				stack.push(curr);
				curr=curr.left;
			}
			curr=stack.pop();
			System.out.print(curr.key+" ");
			curr=curr.right;
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
		preOrderTraversal(root);

	}

}
