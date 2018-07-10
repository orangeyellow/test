package test8;

public class StringDemo5 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		String s = "[";
		for (int x = 0; x < arr.length; x++) {
			String s1 = String.valueOf(arr[x]);
			s += s1;
			if (x == (arr.length - 1)) {
				s += "]";
			} else {
				s += ", ";
			}

		}
		System.out.println(s);
		
		System.out.println(StringDemo5.arrayToString(arr));
	}

	public static String arrayToString(int[] arr) {
		String s = "[";

		for (int x = 0; x < arr.length; x++) {
			String s1 = String.valueOf(arr[x]);
			s += s1;
			if (x == (arr.length - 1)) {
				s += "]";
			} else {
				s += ", ";
			}

		}

		return s;
	}

}
