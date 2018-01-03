package fireCode;

import java.util.Deque;
import java.util.LinkedList;

import fireCode.MatrixMaxSumPathWithDFS.TravelNode;

/*Given an m x n matrix filled with non-negative integers,
 * use depth first search to find the maximum sum along a 
 * path from the top-left of the grid to the bottom-right.
 * Return this maximum sum.The direction of movement is limited to right and down.
*/
public class MatrixMaxSumPathWithDFS {
	static class TravelNode {
		int row;
		int col;
		int nodeSum;

		TravelNode(int r, int c, int sum, int[][] grid) {
			row = r;
			col = c;
			sum += grid[r][c];
			nodeSum = sum;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[][] grid = { { 1, 2, 3 }, 
							 { 4, 5, 6 },
							 { 7, 8, 9 } };
			System.out.println("ans"+matrixMaxSumDfs(grid));
		}
		static boolean isValid(int[][] grid, int row, int col) {
			int ROW = grid.length;
			int COL = grid[0].length;

			if (row >= 0 && col >= 0 && row < ROW && col < COL ) {
				return true;
			}
			return false;
		}

		public static int matrixMaxSumDfs(int[][] grid) {
			Deque<TravelNode> stack = new LinkedList<TravelNode>();
			stack.addFirst(new TravelNode(0, 0, 0, grid));
			int maxSum=Integer.MIN_VALUE;
			TravelNode travelNode;
			int ROW = grid.length;
			int COL = grid[0].length;
			

			while (!stack.isEmpty()) {
				travelNode=(TravelNode)stack.peek();
				stack.pop();
				if(travelNode.row==ROW-1 && travelNode.col==COL-1)
				{
					maxSum=(travelNode.nodeSum>maxSum?travelNode.nodeSum:maxSum);
				}
				else
				{
					if(isValid(grid, travelNode.row+1, travelNode.col))
					stack.addFirst(new TravelNode(travelNode.row+1, travelNode.col, travelNode.nodeSum, grid));
					
					if(isValid(grid, travelNode.row, travelNode.col+1))
					stack.addFirst(new TravelNode(travelNode.row, travelNode.col+1, travelNode.nodeSum, grid));
				}
			}
			return maxSum;
		}
	}
}
