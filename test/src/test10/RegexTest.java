package test10;

import java.util.Arrays;

/*
 * �ַ�����"91 27 46 38 50"
 * ��������ַ�����"27 38 46 50 91"
 * 
 * ������
 * 	1. ����һ���ַ���
 * 	2. ��ȡ����ַ���Ϊһ���ַ�������
 *  3. �ַ���������int����
 *  4. ��int�����������
 *  5. ��int����ת�����ַ������
 */
public class RegexTest {
	public static void main(String[] args) {

		// ����һ���ַ���
		String s = "91 27 46 38 50";

		// ��ȡ����ַ���Ϊһ���ַ�������
		String[] stringArray = s.split(" ");

		// �ַ���������int����
		int[] i = new int[stringArray.length];

		for (int x = 0; x < stringArray.length; x++) {

			i[x] = Integer.parseInt(stringArray[x]);

		}

		// ��int�����������
		Arrays.sort(i);

		// ��int��������ַ���ת��
		StringBuffer sb = new StringBuffer();

		for (int y = 0; y < i.length; y++) {
			if (y != i.length - 1) {
				sb.append(i[y]);
				sb.append(" ");
			} else {
				sb.append(i[y]);
			}
		}

		// ���Ҫ���ʽ���ַ���
		System.out.println(sb.toString());
	}

}
