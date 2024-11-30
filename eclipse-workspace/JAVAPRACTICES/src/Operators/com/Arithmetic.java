package Operators.com;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		
	int num1 =	sc.nextInt();
	System.out.println("Enter number 2:");
	int num2 = sc.nextInt();
	
	int sum = num1 +num2;
	int mul = num1*num2;
	int sub = num1-num2;
	int div = num1/num2;
	System.out.println("The sum is :"+sum);
	System.out.println("The mul is :"+mul);
	System.out.println("The sub is :"+sub);
	System.out.println("The div is :"+div);

	}

}
