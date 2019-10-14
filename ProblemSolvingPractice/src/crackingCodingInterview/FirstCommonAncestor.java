package crackingCodingInterview;

public class FirstCommonAncestor {

	class TreeNodeWithParent {

		TreeNodeWithParent left;
		TreeNodeWithParent right;
		TreeNodeWithParent parent;
		int data;

		public TreeNodeWithParent(TreeNodeWithParent left, TreeNodeWithParent right, TreeNodeWithParent parent,
				int data) {
			this.left = left;
			this.right = right;
			this.parent = parent;
			this.data = data;
		}
		public TreeNodeWithParent(int d) {
			this.left = null;
			this.right = null;
			this.parent = null;
			this.data = d;
		}
	}

	class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		public TreeNode(TreeNode left, TreeNode right, int data) {
			this.left = left;
			this.right = right;
			this.data = data;
		}

		public TreeNode(int d) {
			this.data = d;
		}

	}
	
	
	public TreeNode firstCommonAncestorBST()
	{
		return null;
		
	}
	
	public TreeNode firstCommonAncestorBTWithParent()
	{
		return null;
		
	}
	
	public TreeNode firstCommonAncestorBT()
	{
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
