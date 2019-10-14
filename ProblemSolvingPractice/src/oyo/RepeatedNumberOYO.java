package oyo;

public class RepeatedNumberOYO {

	public static void main(String[] args) {
		RepeatedNumberOYO obj = new RepeatedNumberOYO();
		int res[] = new int[2];
		int[] a = { 3, 1, 2, 5, 3 };
		res = obj.repeatedNumber(a);
		System.out.println(res[0] + "  " + res[1]);
	}

	public int[] repeatedNumber(final int[] A) {

		int n = A.length;
		int xorOfArrayAnd1Ton;
		int set_bit_no = 0;
		int i;
		int firstNumber = 0;
		int secondNumber = 0;
		int res[] = new int[2];

		xorOfArrayAnd1Ton = A[0];
		for (i = 1; i < n; i++)
			xorOfArrayAnd1Ton = xorOfArrayAnd1Ton ^ A[i];

		for (i = 1; i <= n; i++) {
			xorOfArrayAnd1Ton = xorOfArrayAnd1Ton ^ i;

		}

		System.out.println("xor1" + xorOfArrayAnd1Ton);
		set_bit_no = xorOfArrayAnd1Ton & ~(xorOfArrayAnd1Ton - 1);

		for (i = 0; i < n; i++) {
			if ((A[i] & set_bit_no) != 0)
				firstNumber = firstNumber ^ A[i];
			else
				secondNumber = secondNumber ^ A[i];
		}

		System.out.println("x" + firstNumber + " y " + secondNumber);
		for (i = 1; i <= n; i++) {
			if ((i & set_bit_no) != 0)

				firstNumber = firstNumber ^ i;

			else

				secondNumber = secondNumber ^ i;
		}
		res[0] = firstNumber;
		res[1] = secondNumber;
		return res;
	}

}
