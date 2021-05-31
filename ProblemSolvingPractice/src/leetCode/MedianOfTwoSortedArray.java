package leetCode;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();

		int a[] = { 1, 4, 10 };
		int b[] = { 2, 5, 20 };
		System.out.println(obj.findMedianSortedArrays(a, b));
	}

	private void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int l = 0;
		int r = 0;
		int res[] = new int[n + m];
		double median = 0;
		int mid = 0;
		while (l < n && r < m) {

			if (nums1[l] > nums2[r]) {
				res[l + r] = nums2[r];
				r++;
			} else {
				res[l + r] = nums1[l];
				l++;

			}
		}

		while (l < n) {
			res[l + r] = nums1[l];
			l++;
		}
		while (r < m) {
			res[l + r] = nums2[r];
			r++;
		}

		int totalEle = (n + m);

		if ((totalEle) % 2 == 0) {
			mid = totalEle / 2;
			median = ((res[mid - 1] + res[(mid)])) / 2.0;
			// System.out.println(res[mid-1]+" "+res[mid]);
		} else {
			median = res[totalEle / 2];
		}
		// System.out.println(totalEle+" "+mid+" median "+median);
		return median;
	}

}
