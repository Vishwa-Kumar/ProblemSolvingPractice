package crackingCodingInterview;

import crackingCodingInterview.FirstCommonAncestor.TreeNode;

public class FirstCommonAncestorBST {

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
}
