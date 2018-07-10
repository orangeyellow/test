package test8;

public class StringDemo3 {

	public static void main(String[] args) {

		int bigCount = 0;
		int smallCount = 0;
		int numbercount = 0;

		String s = "Hello123World";

		for (int x = 0; x < s.length(); x++) {
			
			char c = s.charAt(x);

			if (c >= 'A' && c <= 'Z') {
				bigCount++;
				continue;
			} else if (c >= 'a' && c <= 'z') {
				smallCount++;
				continue;
			} else if (c >= 1 && c <= 100) {
				numbercount++;
				continue;
			} else {
				continue;
			}

		}
		
		System.out.println("bigCount:"+bigCount);
		System.out.println("smallCount:"+smallCount);
		System.out.println("numbercount:"+numbercount);
		

	}
}
