package hackerRank;

public class MinimumSwap2 {

	public static void main(String[] args) {

		int n[] = { 2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8,
				47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19 };

		System.out.println(minimumSwaps(n));

	}

	static int minimumSwaps(int[] arr) {

		int swapCount = 0;
		int totalCycle = 0;
		boolean visited[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i " + i + " arr[i]" + arr[i]);
			if (arr[i] == i + 1) {
				System.out.println("i equal " + i + " arr[i]" + arr[i]);
				visited[i] = true;
				continue;
			}
			int j = i;
			while (visited[j] == false && arr[j] != j + 1) {
				if (j == i) {
					totalCycle++;
				}
				System.out.println("j " + j + " arr[j]" + arr[j]);
				visited[j] = true;
				swapCount++;
				j = arr[j] - 1;
			}

		}
		return swapCount - totalCycle;
	}

}
