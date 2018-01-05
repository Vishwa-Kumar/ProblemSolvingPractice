package fireCode;

import java.util.LinkedList;
import java.util.Queue;

public class LevelWithMaxSumInATree {
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
		LevelWithMaxSumInATree.TreeNode root = new LevelWithMaxSumInATree.TreeNode(1, null, null);
		root.left = new TreeNode(2, null, null);
		root.right = new TreeNode(3, null, null);
		root.left.left = new TreeNode(4, null, null);
		root.left.right = new TreeNode(5, null, null);
		root.right.left = new TreeNode(6, null, null);
		root.right.right = new TreeNode(7, null, null);
		root.left.left.left = new TreeNode(8, null, null);
		System.out.println("ans" + new LevelWithMaxSumInATree().findMaxSumLevel(root));

	}

	public int findMaxSumLevel(TreeNode root) {
		if(root==null)
		{
			return -1;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode node;
		int levelWithMaxSum = 0;
		int level = -1;
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		while (true) {
			// nodeCount (queue size) indicates number of nodes
			// at current level.
			sum = 0;
			int nodeCount = q.size();
			if (nodeCount == 0)
				break;

			// Dequeue all nodes of current level and Enqueue all
			// nodes of next level
			while (nodeCount > 0) {

				node = q.peek();
				sum += node.data;
				System.out.print(node.data + " ");
				q.remove();
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
				nodeCount--;
			}
			level++;
			if (sum > maxSum) {
				maxSum = sum;
				levelWithMaxSum = level;
			}
			System.out.println(
					"sum" + sum + " maxsum" + maxSum + " level" + level + " levelWithMaxSum" + levelWithMaxSum);
		}
		return levelWithMaxSum;
	}

}
