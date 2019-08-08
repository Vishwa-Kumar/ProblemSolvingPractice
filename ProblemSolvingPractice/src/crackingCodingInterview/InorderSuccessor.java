package crackingCodingInterview;

public class InorderSuccessor {
	static class Node {

		Node left;
		Node right;
		Node parent;
		int data;

		Node(Node l, Node r, Node p, int d) {
			left = l;
			right = r;
			parent = p;
			data = d;
		}
		Node( int d) {
			left = null;
			right = null;
			parent = null;
			data = d;
		}
	}
	public static Node inorderSuccessor(Node n)
	{
		if(n.right!=null)
		{
			return returnLeftMostNode(n.right);
		}
		Node q=n;
		Node p=n.parent;
		while(q!=null && q!=p.left)
		{
			q=p;
			p=p.parent;
		}
		return p;
	}
	
	public static Node returnLeftMostNode(Node n)
	{
		if(n==null || n.left==null)
		{
			return n;
		}
		else
		{
			while(n.left!=null)
			{
				n=n.left;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(50);
		Node a=new Node(25);
		a.parent=root;
		root.left=a;
		Node b=new Node(80);
		b.parent=root;
		root.right=b;
		Node c=new Node(20);
		c.parent=a;
		Node d=new Node(40);
		d.parent=a;
		a.left=c;
		a.right=d;
		Node ans=inorderSuccessor(a);
		System.out.println(ans.data);

	}

}
