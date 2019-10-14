package leetCode.amazon.arraysAndStrings;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater obj = new ContainerWithMostWater();
//		
//		Input: [1,8,6,2,5,4,8,3,7]
//				Output: 49
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(obj.maxArea(height));
	}

	public int maxArea(int[] height) {

		int s = 0;
		int e = height.length - 1;
		int mostWater = 0;
		int water = 0;

		while (s <= e) {
			if (height[s] > height[e]) {
				water = height[e] * (e - s);
				e--;
			} else {
				water = height[s] * (e - s);
				s++;
			}
			mostWater = Math.max(water, mostWater);

		}

		return mostWater;
	}

}
