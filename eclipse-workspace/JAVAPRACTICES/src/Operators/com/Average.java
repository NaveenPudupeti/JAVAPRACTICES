package Operators.com;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How Many Vaalues do you want to add?");
		
		int size = sc.nextInt();
		int sum=0;
		int sumavg[] = new int[size];
		System.out.println("Enter your Number:");
		
		for(int i =0; i<size;i++) {
			sumavg[i] = sc.nextInt();
			sum = sum +sumavg[i];
		}
		double sum1 = sum;
		System.out.println("sum is :"+sum);
		System.out.println("Avg is : "+(sum1/size));
		
		sc.close();
		
	}
	
}
