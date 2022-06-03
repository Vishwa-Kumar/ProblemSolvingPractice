package leetCode.google.interviewProcess;

import java.util.*;

public class ThreeSum {
	static List<List<Integer>> listOfList = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		listOfList.clear();
		ThreeSum obj = new ThreeSum();
		obj.threeSum(nums);
		System.out.println(listOfList);

	}

	public List<List<Integer>> threeSum(int[] nums) {

		threeSumPairMethod(nums);
		return listOfList;

	}

	public void threeSumPairMethod(int[] nums) {
		if (nums.length < 3) {
			return;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
			if (nums[i - 1] != nums[i]) {
				findPairSum(nums,i);
			}

		}
	}

	private ArrayList<Integer> findPairSum(int[] nums,int startIndex) {
		int s = startIndex + 1;
		int e = nums.length - 1;

		while (s < e) {
			int sum=nums[startIndex]+nums[s]+nums[e];
			if (sum == 0) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(nums[s]);
				list.add(nums[e]);
				list.add(sum);
				listOfList.add(list);
				s++;
				e--;
				while(s<e && nums[s]==nums[s-1])// to ignore duplicate elements
				{
					s++;
				}

			} else if (sum>0) {
				e--;
			} else if (sum<0) {
				s++;
			}
		}
		return null;
	}

}
