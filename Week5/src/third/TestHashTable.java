package third;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TestHashTable {

	public static void main(String[] args) {
		// HashTable : HashMap�� ������ ���α���, �������� �޼��尡 synchronized �Ǿ��ִ�.		
		Map<Integer, String> login = new Hashtable<Integer, String>();
		
		login.put(20201234, "kim");
		login.put(20201235, "lee");
		login.put(20201236, "park33");
		login.put(20191111, "choi");
		
		Scanner scv = new Scanner(System.in);
		
		while(true) {
			System.out.print("�й� : ");
			int id = scv.nextInt();
			scv.nextLine(); // �ٹٲ� ó��
			
			System.out.print("��� : ");
			String pw = scv.nextLine();
			
			if(login.containsKey(id)) {
				if(login.get(id).equals(pw)) {
					System.out.println("�α��� �Ϸ�");
					break;
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�");
			}
		}	
	}
}