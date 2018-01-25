package fireCode;

/*Given an array of integers consisting of both positive and negative
numbers, find the contiguous subsequence that has the maximum sum among all subsequences in the array (click the red text to learn more about subsequences). Write a method that takes in
an array of integers arr and returns an array res containing 3 integers in the following format:*/

public class MaximumContiguousSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 2, 3, -2, 5 };
		int res[] = maxContSequence(arr);
		System.out.println("maxSum" + res[0] + " startindex" + res[1] + " endindex" + res[2]);

	}

	public static int[] maxContSequence(int[] arr) {

		int[] res = new int[] { 0, 0, 0 };
		int arrSize = arr.length;
		if (arrSize == 0) {
			res[2] = -1;
			return res;
		}
		if (arrSize == 1) {
			res[0] = arr[0];
			res[1] = 0;
			res[2] = 0;
			return res;
		}
		int sol[][] = new int[arrSize][arrSize];
		int maxSum = arr[0];

		int sum;
		res[0] = arr[0];
		for (int i = 0; i < arrSize; i++) {
			sum = Integer.MIN_VALUE;
			for (int j = i; j < arrSize; j++) {

				if (i == j) {
					sol[i][j] = arr[i];
					sum = arr[i];
				} else {
					sum += arr[j];
					if (sum > maxSum) {
						res[0] = sum;
						maxSum = sum;
						res[1] = i;
						res[2] = j;
					}
					sol[i][j] = sum;
				}
				//System.out.println("i" + i + " j" + j + " sum" + sum + "maxsum" + maxSum + " sol[][]" + sol[i][j]);
			}
		}
		return res;
	}

}
