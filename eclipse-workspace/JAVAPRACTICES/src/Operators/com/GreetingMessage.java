package Operators.com;

import java.util.Scanner;

public class GreetingMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Hello" +" "+ name);
		
		sc.close();

	}

}
