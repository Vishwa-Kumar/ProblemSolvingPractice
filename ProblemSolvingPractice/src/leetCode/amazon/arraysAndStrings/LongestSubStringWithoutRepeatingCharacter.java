package leetCode.amazon.arraysAndStrings;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input: "abcabcbb"
//			Output: 3 
//			Explanation: The answer is "abc", with the length of 3. 

		LongestSubStringWithoutRepeatingCharacter obj = new LongestSubStringWithoutRepeatingCharacter();
		String s = "abcabcbb";
		System.out.println(obj.lengthOfLongestSubstring(s));

	}

	public int lengthOfLongestSubstring(String s) {

		if (s == null) {
			return 0;
		}
		if (s.length() < 2) {
			return s.length();
		}
		char[] characters = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int maxSize = 1;
		hm.put(characters[0], 0);
		for (int i = 1; i < characters.length; i++) {
			if (hm.containsKey(characters[i])) {
				i = hm.get(characters[i]);
				hm.clear();
				continue;
			}
			hm.put(characters[i], i);
			if (maxSize < hm.size()) {
				maxSize = hm.size();
			}
		}
		return maxSize;
	}

}
