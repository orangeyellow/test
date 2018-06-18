package test;

public class MaxArrayValue {

	public static void main(String[] args) {

		// 数组的静态初始化
		int[] arr = { 34, 98, 10, 25, 67, 100 };

		int max = 0;
		int min = 0;
		
		
		max = max(arr);
		System.out.println("arr的最大值：" + max);

		min = min(arr);
		System.out.println("arr的最小值：" + min);

	}

	
	/*
	 * 数组的最大值
	 */
	public static int max(int[] arr) {

		int max = 0;

		for (int x = 0; x < arr.length; x++) {

			if (arr[x] > max) {
				max = arr[x];
			} else {
				continue;
			}
		}

		return max;
	}

	/*
	 * 数组的最小值
	 */
	public static int min(int[] arr) {

		int min = 0;

		for (int x = 0; x < arr.length; x++) {

			if (min == 0) {
				min = arr[0];
			} else if (arr[x] < min) {
				min = arr[x];

			} else {
				continue;
			}
		}

		return min;
	}

}
