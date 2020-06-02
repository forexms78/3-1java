package third;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TestHashTable {

	public static void main(String[] args) {
		// HashTable : HashMap과 동일한 내부구조, 차이점은 메서드가 synchronized 되어있다.		
		Map<Integer, String> login = new Hashtable<Integer, String>();
		
		login.put(20201234, "kim");
		login.put(20201235, "lee");
		login.put(20201236, "park33");
		login.put(20191111, "choi");
		
		Scanner scv = new Scanner(System.in);
		
		while(true) {
			System.out.print("학번 : ");
			int id = scv.nextInt();
			scv.nextLine(); // 줄바꿈 처리
			
			System.out.print("비번 : ");
			String pw = scv.nextLine();
			
			if(login.containsKey(id)) {
				if(login.get(id).equals(pw)) {
					System.out.println("로그인 완료");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("입력하신 id는 존재하지 않습니다");
			}
		}	
	}
}