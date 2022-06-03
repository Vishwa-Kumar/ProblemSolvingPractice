package leetCode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
		System.out.println(obj.longestPalindrome("abcba"));

	}

	public String longestPalindrome(String s) {

		String palindromeEven = checkEven(s);
		String palindromeOdd = checkOdd(s);
		String ans = (palindromeEven.length() > palindromeOdd.length() ? palindromeEven : palindromeOdd);
		return ans;

	}

	private String checkEven(String s) {
		int length = s.length();
		int leftPtr = 0;
		int rightPtr = 0;
		int centePointerL = 0;
		int centePointerR = 0;

		String palindrome = s.charAt(0) + "";
		for (int i = 1; i < length; i++) {
			centePointerL = i - 1;
			centePointerR = i;
			leftPtr = centePointerL;
			rightPtr = centePointerR;
			char cL = s.charAt(centePointerL);
			char cR = s.charAt(centePointerR);
			if (cL == cR) {
				while ((leftPtr >= 0 && rightPtr < length)) {
					cL = s.charAt(leftPtr);
					cR = s.charAt(rightPtr);
					if (cL != cR) {
						break;
					} else {
						if ((rightPtr - leftPtr + 1 > palindrome.length())) {
							rightPtr = rightPtr + 1 > length ? length : rightPtr + 1;
							palindrome = s.substring(leftPtr, rightPtr);
							rightPtr--;
						}
					}
					leftPtr--;
					rightPtr++;
				}
			}
		}
		return palindrome;
	}

	private String checkOdd(String s) {
		int length = s.length();
		int leftPtr = 0;
		int rightPtr = 0;
		String palindrome = s.charAt(0) + "";
		char cL = s.charAt(leftPtr);
		char cR = s.charAt(rightPtr);
		for (int i = 1; i < length; i++) {
			leftPtr = i;
			rightPtr = i;
			cL = s.charAt(leftPtr);
			cR = s.charAt(rightPtr);
			while ((leftPtr >= 0 && rightPtr < length)) {
				cL = s.charAt(leftPtr);
				cR = s.charAt(rightPtr);
				if (cL != cR) {
					break;
				} else {
					if ((rightPtr - leftPtr + 1 > palindrome.length())) {
						rightPtr = rightPtr + 1 > length ? length : rightPtr + 1;
						palindrome = s.substring(leftPtr, rightPtr);
						rightPtr--;
					}
					leftPtr--;
					rightPtr++;
				}

			}

		}

		return palindrome;
	}

}
