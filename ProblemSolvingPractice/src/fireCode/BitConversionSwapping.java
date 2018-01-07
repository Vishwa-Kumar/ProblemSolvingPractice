package fireCode;

/*Given two input integers a and b, write a method to determine the number of bits required to be swapped to convert a to b.*/

public class BitConversionSwapping {

	public static void main(String[] args) {

		System.out.println(new BitConversionSwapping().bitSwapRequired(21, 31));
	}

	public int bitSwapRequired(int a, int b) {
		int c = a ^ b;
		System.out.println("c" + c);
		return countOnBit(c);
	}

	public int countOnBit(int a) {
		System.out.println("countOnBit a" + a);
		int count = 0;
		while (a != 0) {
			a = a & (a - 1);
			System.out.println("a" + a);
			count++;
		}
		return count;
	}

}
