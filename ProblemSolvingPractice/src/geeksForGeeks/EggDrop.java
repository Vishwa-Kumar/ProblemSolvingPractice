package geeksForGeeks;

public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int eggDrop(int n, int k) {
		// Your code here

		if (k == 0 || k == 1) {
			return k;
		}
		if (n == 1) {
			return k;
		}

		int min = Integer.MAX_VALUE;
		int x, res;

		for (x = 0; x < k; x++) {
			res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));

			if (min < res) {
				min = res;
			}
		}

		return min + 1;
	}
}
