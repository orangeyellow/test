package test;

/**
 * ��̬����ı���������
 * @author Ҷ����
 * 
 *22233eeee
 */
public class Dynamic_2_ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������һ����̬�Ķ�ά����
		int[][] arr = new int[3][];
		
		System.out.println(arr.length);
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		// System.out.println(arr[1][0]);
		
		int[][] arr2 = {{1,2,3},{7,8,9},{4,5,6}};
		int[][] arr3 = {{1,2,3},{7,9},{4,5,6}};
		
		traverse2Array(arr3);
	}
	
	
	/**
	 * @deprecated������ά����ķ���
	 * @param arr ����һ��int���͵�����
	 */
	public static void traverse2Array(int[][] arr) {
		
		for(int x = 0; x < arr.length; x++) {
			
			for(int y = 0; y < arr[x].length; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}
	}

}
