package test13;

public class InterImpl<T> implements Inter<T> {

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}


	
//	@Override
//	public <T> void show(T t) {
//		// TODO Auto-generated method stub
//		System.out.println(t);
//	}

}
