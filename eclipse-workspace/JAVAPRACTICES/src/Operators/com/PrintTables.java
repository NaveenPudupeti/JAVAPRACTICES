package Operators.com;

import java.util.*;

public class PrintTables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			
			for(int j =1; j<=10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}

	}

}
