package interviewBit;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterComb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterComb obj = new LetterComb();
		obj.letterCombinations("12");
		System.out.println(obj);

		for (String s : obj.ans) {
			System.out.println(s);
		}
	}

	ArrayList<String> ans = new ArrayList<String>();

	public ArrayList<String> letterCombinations(String A) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "0");
		hm.put(1, "1");
		hm.put(2, "abc");
		hm.put(3, "def");
		hm.put(4, "ghi");
		hm.put(5, "jkl");
		hm.put(6, "mno");
		hm.put(7, "pqrs");
		hm.put(8, "tuv");
		hm.put(9, "wxyz");

		letterCombinationsUtil(A, hm, 0, new StringBuilder());
		return ans;
	}

	public void letterCombinationsUtil(String A, HashMap<Integer, String> hm, int index, StringBuilder t) {

		if (index == A.length()) {
			return;
		}
		String temp = hm.get(Integer.parseInt(A.charAt(index) + ""));
		// abc

		for (int i = 0; i < temp.length(); i++) {
			t.append(temp.charAt(i) + "");
			if (index == A.length() - 1) {
				ans.add(new String(t));
			}
			letterCombinationsUtil(A, hm, index + 1, t);
			t.deleteCharAt(t.length() - 1);

		}
	}

}
