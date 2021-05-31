package leetCode.amazon.dp;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubArray obj = new MaximumSubArray();
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(obj.maxSubArray(nums));

	}

	public int maxSubArray(int[] nums) {
		int n = nums.length;
		int currSum = nums[0], maxSum = nums[0];
		for (int i = 1; i < n; ++i) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	public static void print(int[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
