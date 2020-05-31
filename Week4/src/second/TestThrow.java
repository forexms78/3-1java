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
		throw new Exception("바로 만든 예외 던지기!");
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
//			System.out.println("정수를 입력해야 합니다~");
//		}
//		
//		//	throw
//		//		try {
////			Exception ex = new Exception("내가 만든 예외!");
////			throw ex;
////		}catch(Exception e) {
////		System.out.println("예외처리 메시지 : " + e.getMessage());
////		}finally {
////			System.out.println("throw 테스트");
////		}
//
//	}
//
//}
