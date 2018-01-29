package fireCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSummationWithNumberConstraint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 4,6,7,9,10,-11};
		boolean res = groupSumWithNum(arr, 3, 7);
		System.out.println("res" + res);

	}

	public static boolean groupSumWithNum(int[] arr, int must_have, int target) {

		int size = arr.length;
		int sol[][] = new int[size][size];
		int sum = 0;
		int sumToFind = target - must_have;

		for (int i = 0; i < size; i++) {
			sum=0;
			for (int j = i; j < size; j++) {
				if (i == j) {
					sol[i][j] = arr[i];
					sum = arr[i];
					if(sum==sumToFind)
					{
						return true;
					}
				} else {
					sum += arr[j];

					if (sum == sumToFind) {
						return true;
					}
					sol[i][j] = sum;
				}
				System.out.println("i" + i + " j" + j + " sum" + sum + " sol[][]" + sol[i][j]);
			}
		}
		return false;
	}

}
