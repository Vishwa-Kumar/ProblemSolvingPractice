package fireCode;


/*Implement a method to insert a node into a
Binary Search Tree
. Return the root of the modified tree.*/

public class JamIntoBST {
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
		JamIntoBST.TreeNode root1 = new JamIntoBST.TreeNode(1, null, null);
		root1.left = new TreeNode(3, null, null);
		root1.right = new TreeNode(2, null, null);
		root1.right.left = new TreeNode(5, null, null);
		root1.right.right = new TreeNode(4, null, null);

	}
	
	
	public TreeNode insert(TreeNode root, int data) { 
		 
		if(root==null)
		{
			return new JamIntoBST.TreeNode(data, null, null);
		}
		
		  if (data < root.data)
		  {
			  root.left=insert(root.left,data);
		  }
		  else if (data > root.data)
		  {
			  root.right=insert(root.right, data);
		  }
		
	    

    return root;
	}

}
