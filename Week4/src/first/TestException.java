package first;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

// Runtime Exception
// �Ϲ�(compile-time) Exception
public class TestException {
	public static void main(String[] args) {
		// ��� ����
//		int n = 100;
//		int r =0;
//		try {
//		for(int k = 0; k<10; k++) {
//			r = n / (int)(Math.random()*10);
//			System.out.println(r);
//		}
//		}catch(ArithmeticException e) {
//			System.out.println("�и� 0�� �ü� �����ϴ�.");
//			System.out.println(e.getMessage());
//		}
//		System.out.println(Math.random());

//	�ε��� ���� ����
		double[] arr = {3.14,2.71};
		String s = "Just java programming~";
		StringTokenizer st = new StringTokenizer(s);

		try {
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken() + " ");
			}
			
		System.out.println(arr[1]);
		System.out.println(5/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε��� ������ ���� �����ϴ�.");
		}catch(NoSuchElementException e) {
			System.out.println("�� �̻� ���� ��Ұ� �����ϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("�и� 0�� �ü� �����ϴ�.");
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("�ͼ��� ���� �����");
		}
		finally {
		}
			System.out.println("�׻� ����!!");
		}
	}
