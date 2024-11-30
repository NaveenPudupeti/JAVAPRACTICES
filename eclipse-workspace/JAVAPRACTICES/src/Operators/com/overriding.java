package Operators.com;


class shape {
	double area () {
		System.out.println("In area method of shape");
		return 2.2;
		
	}
}

class circle extends shape{
	double radius;
	circle(double radius){
		this.radius=radius;
		
	}
	double area() {
		System.out.println("In area method of circle");
		return Math.PI*radius*radius;
	}
	
	double test () {
		System.out.println("In area method of test");
		return Math.PI*radius*radius;
	}
}

class rectangle extends shape {
	double length,width;
	rectangle(double length,double width){
	this.length=length;
	this.width = width;
	
	}
	double area() {
		System.out.println("In area method of rectangle");
		return length*width;
	}
	
	double rectanglelength() {
		System.out.println(" In rectanglelength metbod of rectangle");
		return length;
	}
}

public class overriding {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape sc = new circle(5);
		
		sc.area();
		circle sc1 = new circle(5);
		sc1.test();
 shape sc2 = new rectangle (4,6) ;
	 sc2.area();
	 rectangle sc22 = new rectangle (5,6);
	 sc22.rectanglelength();
	 
	 
 }
	}


