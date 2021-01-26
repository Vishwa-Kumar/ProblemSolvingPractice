package geeksForGeeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class JumpingNUmber {

	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printJumpingNUmber(102);
		Collections.sort(result);

		for (int j : result) {
			System.out.print(j + " ");
		}
		result.clear();
	}

	public static void printJumpingNUmber(int n) {
		if (n < 0) {
			System.out.println(-1);
			return;
		}
		// System.out.print(0+" ");
		result.add(0);

		for (int i = 1; i <= 9 & i < n; i++) {
			bfs(n, i);
		}

	}

	private static void bfs(int n, int i) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(i);
		int temp = 0;
		while (!q.isEmpty()) {
			temp = q.poll();
			if (temp < n) {
				// System.out.print(temp+" ");
				result.add(temp);

				int lastDigit = temp % 10;
				int num = 0;

				if (lastDigit == 0) {
					num = (temp * 10) + (lastDigit + 1);
					q.add(num);
					System.out.println(q);
				} else if (lastDigit == 9) {
					num = (temp * 10) + (lastDigit - 1);
					q.add(num);
				} else {
					num = (temp * 10) + (lastDigit + 1);
					q.add(num);
					num = (temp * 10) + (lastDigit - 1);
					q.add(num);
				}
			}
		}
	}

}
