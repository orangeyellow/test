package test10;

import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerDemo {

	public static void main(String[] args) {
		
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("5");
		
		
		System.out.println(b1.add(b2));
		System.out.println(b1.subtract(b2));
		System.out.println(b1.multiply(b2));
		System.out.println(b1.divide(b2));
		System.out.println(Arrays.toString(b1.divideAndRemainder(b2)));
	}
}
