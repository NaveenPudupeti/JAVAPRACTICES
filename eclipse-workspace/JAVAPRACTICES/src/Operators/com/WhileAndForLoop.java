package Operators.com;

import java.util.Scanner;

public class WhileAndForLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String option ="yes";
		String opinion = "yes";
		while(option.equalsIgnoreCase(opinion)) {
		System.out.println("Enter your number:");
		
		num =sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
			
		}
		System.out.println("If YOU WANT TO PRINT ONE MORE TABLE?(YES/NO)");
		
		opinion=sc.next();
		
		
		}
	}

}
