package test;

import java.util.Scanner;

public class text2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a,b=1;
		
		a = scan.nextInt();
		
		for(int i = a; i>0;i--) {
				b= b*i;
	}
		System.out.println(b);
	}	

}
