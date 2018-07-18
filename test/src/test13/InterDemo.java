package test13;

public class InterDemo {
	public static void main(String[] args) {

		Inter<String> in = new InterImpl<String>();
		in.show("hello");
	}
}
