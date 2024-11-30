package Operators.com;
//Arithmetic operators are used to perform common mathematical operators.
public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7654;
		int b = 8767;
		System.out.println("Arithmetic operators starts ::");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(a--);
		System.out.println(b--);
		System.out.println("Arithmetic operators ends .");
		System.out.println("===========================================================");
		System.out.println("Assignment operators starts ::");
		System.out.println("int x = 10");
		
		int x = 10;
		System.out.println(x=5);
		System.out.println(x+=3);
		System.out.println(x-=3);
		System.out.println(x*=3);
		System.out.println(x/=3);
		System.out.println(x&=3);
		System.out.println(x|=3);
		System.out.println(x^=3);
		System.out.println(x>>=3);
		System.out.println(x<<=3);
		System.out.println("Assignment operators ends.");
		System.out.println("===========================================================");
		
		System.out.println("comparison operators starts::");
		System.out.println("int i =5");
		System.out.println("int j = 3");
		int i =5;
		int j = 3;
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i<=j);
		System.out.println(i>=j);
		System.out.println("Comparison operators ends.");
		System.out.println("===========================================================");
		System.out.println("Logical operators starts ::");
		System.out.println(x<5&&x<3);
		System.out.println(x<5||x<10);
		System.out.println(!(x<5&&x<3));
		System.out.println(!(x<5||x<10));
		
		System.out.println("Logical operators ends.");
		System.out.println("===========================================================");
		System.out.println("Bitwise operators starts::");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		System.out.println("Bitwise operators ends.");
		System.out.println("===========================================================");
		
		
		
		
		
		

	}

}
