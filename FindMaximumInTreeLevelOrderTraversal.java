package tree;
import java.util.*;

public class FindMaximumInTreeLevelOrderTraversal {
	public static int levelMax(Node root)
	{
		int max=Integer.MIN_VALUE;
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			Node curr=q.poll();
			max=Math.max(max,curr.key);
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
		return max;
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
		int max=levelMax(root);
		System.out.println("The maximum in the tree is: "+max);

	}

}
