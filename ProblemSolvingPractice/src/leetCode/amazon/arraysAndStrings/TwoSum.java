package leetCode.amazon.arraysAndStrings;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum obj = new TwoSum();
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int res[]=new int[2];
		res=obj.twoSum(nums, target);
		
		System.out.println(res[0]+" "+res[1]);

	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int res[] = new int[2];
		int left = 0;
		for (int i = 0; i < nums.length; i++) {
			left = target - nums[i];
			if (hm.containsKey(left)) {
				res[1] = i;
				res[0] = hm.get(left);
				return res;
			}
			hm.put(nums[i], i);
		}
		return res;
	}

}
