package leetCode.google.interviewProcess;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4,2,0,2,3,2,0 };
		// Arrays.sort(nums,1,4);
		System.out.println(Arrays.toString(nums));

		NextPermutation solution = new NextPermutation();
		solution.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));

	}

	
	    public void nextPermutation(int[] nums) {
	        int i = nums.length - 2;
	        while (i >= 0 && nums[i + 1] <= nums[i]) {
	            i--;
	        }
	        if (i >= 0) {
	            int j = nums.length - 1;
	            while (nums[j] <= nums[i]) {
	                j--;
	            }
	            swap(nums, i, j);
	        }
	        reverse(nums, i + 1);
	    }

	    private void reverse(int[] nums, int start) {
	        int i = start, j = nums.length - 1;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }

	    private void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	
}
