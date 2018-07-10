package test8;

public class StringDemo7 {

	public static void main(String[] args) {
		String s = "woaijavawozhenaijavawozhendehenaijavaxingbuxingwoaijavagun";
		String s2 = "java";
		int count = 0;
		int temp = 0;

		// while (s.indexOf(s2) != -1) {
		//
		// count++;
		// s = s.substring(s.indexOf(s2) + s2.length());
		//
		// }
		// System.out.println(count);

		while (true) {
			// int x = s.indexOf(s2, temp);
			if (s.indexOf(s2, temp) == -1) {
				break;
			} else {
				count++;
				temp = s.indexOf(s2, temp) + s2.length();
				continue;
			}
		}
		System.out.println(count);
	}
}
