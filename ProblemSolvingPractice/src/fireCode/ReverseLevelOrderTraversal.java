package fireCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrderTraversal {

	private static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data, TreeNode left, TreeNode right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
	public static void main(String[] args) {
		ReverseLevelOrderTraversal.TreeNode root = new ReverseLevelOrderTraversal.TreeNode(1, null, null);
		root.left = new TreeNode(2, null, null);
		root.right = new TreeNode(3, null, null);
		root.left.left = new TreeNode(4, null, null);
		root.left.right = new TreeNode(5, null, null);
		root.right.left = new TreeNode(6, null, null);
		root.right.right = new TreeNode(7, null, null);
		
		System.out.println("ans" + new ReverseLevelOrderTraversal().levelorderRev(root));

	}
	
	public ArrayList<Integer> levelorderRev(TreeNode root) {
		ArrayList<Integer> returnList=new ArrayList<>();
		if(root==null)
		{
			return returnList;
		}
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		
		while(true)
		{
			int nodeCount=q.size();
			TreeNode node;
			
			if(nodeCount==0)
				break;
			
			while(nodeCount>0) {
				
				node=q.peek();
				q.remove();
				returnList.add(node.data);
				
				if(node.right!=null)
				{
					q.add(node.right);
				}
				if(node.left!=null)
				{
					q.add(node.left);
				}
				nodeCount--;
			}
		} 
		Collections.reverse(returnList);
		return returnList;
	}

	
	
}
