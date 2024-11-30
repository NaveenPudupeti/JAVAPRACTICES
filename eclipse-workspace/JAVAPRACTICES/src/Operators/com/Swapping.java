package Operators.com;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int temp;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number1:");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter your Number2:");
		int num2 = sc.nextInt();
		
	System.out.println("Before Swapping:");
		
		System.out.println("a is"+num1+"b is"+num2);
		
	//	temp = num1;
		
		//num1 = num2;
		//num2 = temp;
		
		
		num1 = num1+num2;
		
		num2 = num1-num2;
		num1= num1-num2;
	System.out.println("Ater Swapping:");
		
		System.out.println("a is"+num1+"b is"+num2);

	}

}
