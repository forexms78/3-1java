package second;

import java.util.Scanner;

public class TestThrow{
	static void f1() {
		try {
			f2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	static void f2() throws Exception {
		throw new Exception("�ٷ� ���� ���� ������!");
	}
	public static void main(String[] args) {
		
		f1();
	}
}
//package second;
//
//import java.util.Scanner;
//
//public class TestThrow {
//	private static void square(String s) throws NumberFormatException{
//		int i = Integer.parseInt(s);
//		System.out.println(i * i);
//	}
//	public static void main(String[] args) {
//		Scanner scv = new Scanner(System.in);
//		try {
//			square(scv.nextLine());
//		} catch (NumberFormatException e) {
//			System.out.println("������ �Է��ؾ� �մϴ�~");
//		}
//		
//		//	throw
//		//		try {
////			Exception ex = new Exception("���� ���� ����!");
////			throw ex;
////		}catch(Exception e) {
////		System.out.println("����ó�� �޽��� : " + e.getMessage());
////		}finally {
////			System.out.println("throw �׽�Ʈ");
////		}
//
//	}
//
//}
