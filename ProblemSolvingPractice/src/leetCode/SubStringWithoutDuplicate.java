package leetCode;

import java.util.HashMap;

public class SubStringWithoutDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStringWithoutDuplicate obj = new SubStringWithoutDuplicate();
		String str1 = "tmmzuxt";
		
		System.out.println(obj.windowSlidingMethodOptimised(str1));

	}

	public int lengthOfLongestSubstring(String s) {

		return impNaive(s);
	}

	/*
	 * brute force approach, create all possible substring, keep track of max
	 * substring without duplicate Time complexity : O(n^3).
	 */
	private int impNaive(String s) {
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (checkRepetition(s, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}
		return res;
	}

	private boolean checkRepetition(String s, int start, int end) {
		int[] chars = new int[128];

		for (int i = start; i <= end; i++) {
			char c = s.charAt(i);
			chars[c]++;
			if (chars[c] > 1) {
				return false;
			}
		}

		return true;
	}

	/*
	 * 
	 * In the naive approaches, we repeatedly check a substring to see if it has
	 * duplicate character. But it is unnecessary.
	 * 
	 * 
	 * 
	 */
	private int windowSlidingMethod(String s) {
		int chars[] = new int[128];
		int l = 0;
		int r = 0;
		int length = s.length();
		int res = 0;

		while (r < length) {
			char c = s.charAt(r);
			chars[c]++;

			while (chars[c] > 1) {
				char lchar = s.charAt(l);
				chars[lchar]--;
				l++;
			}

			res = Math.max(res, r - l + 1);
			r++;

		}
		return res;
	}

	/*
	 * 
	 * In the naive approaches, we repeatedly check a substring to see if it has
	 * duplicate character. But it is unnecessary.
	 * 
	 * this is optimised approach of sliding window where we can directly come to
	 * duplicate point if we have mapping of characters and its index
	 * 
	 */
	private int windowSlidingMethodOptimised(String s) {
		
		int l = 0;
		int r = 0;
		int length = s.length();
		int res = 0;
		HashMap<Character,Integer> hmap=new HashMap<>();

		for( l=0,r=0;r<length;r++)
		{
			Character c=s.charAt(r);
			if(hmap.containsKey(c))	
			{
				l=Math.max(l,hmap.get(c)+1);
				
			}
			hmap.put(c,r);
			res=Math.max(res, r-l+1);
		}
		return res;
	}

}
