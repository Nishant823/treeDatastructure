package tree;
import java.util.*;

public class PrintSpiralLevelOrderTree {
	public static ArrayList<Integer> spiralLevelOrder(Node root)
	{
		ArrayList<Integer>list=new ArrayList<Integer>();
		if(root==null)
		{
			return list;
		}
		Stack<Node>stack1=new Stack<Node>();
		Stack<Node>stack2=new Stack<Node>();
		stack1.push(root);
		while(stack1.isEmpty()==false||stack2.isEmpty()==false)
		{
			while(stack1.isEmpty()==false)
			{
				Node temp=stack1.pop();
				list.add(temp.key);
				if(temp.right!=null)
				{
					stack2.push(temp.right);
				}
				if(temp.left!=null)
				{
					stack2.push(temp.left);
				}
			}
			while(stack2.isEmpty()==false)
			{
				Node temp=stack2.pop();
				list.add(temp.key);
				if(temp.left!=null)
				{
					stack1.push(temp.left);
				}
				if(temp.right!=null)
				{
					stack1.push(temp.right);
				}
			}
		}
		return list;
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
		ArrayList<Integer> list=spiralLevelOrder(root);
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}

	}

}
