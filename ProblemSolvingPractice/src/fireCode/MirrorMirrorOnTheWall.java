package fireCode;



public class MirrorMirrorOnTheWall {

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
		MirrorMirrorOnTheWall.TreeNode root1 = new MirrorMirrorOnTheWall.TreeNode(1, null, null);
		root1.left = new TreeNode(3, null, null);
		root1.right = new TreeNode(2, null, null);
		root1.right.left = new TreeNode(5, null, null);
		root1.right.right = new TreeNode(4, null, null);
		
		
		
		
		MirrorMirrorOnTheWall.TreeNode root2 = new MirrorMirrorOnTheWall.TreeNode(1, null, null);
		root2.left = new TreeNode(2, null, null);
		root2.right = new TreeNode(3, null, null);
		root2.left.left = new TreeNode(4, null, null);
		root2.left.right = new TreeNode(5, null, null);
		System.out.println("ans" + new MirrorMirrorOnTheWall().isMirror(root1,root2));

	}
	public boolean isMirror(TreeNode root1, TreeNode root2) {
		
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1==null || root2==null)
		{
			return false;
		}
		return (root1.data==root2.data) && (isMirror(root1.left,root2.right) && (isMirror(root1.right,root2.left)));
	}

}
