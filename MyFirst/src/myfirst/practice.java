package myfirst;


abstract  class shape {
	
	abstract double perimeter();
	abstract double area();
	
}

class circle extends shape{
	
	double radius;
	double perimeter() {
		return 2*Math.PI*radius;
	}
	double area() {
		return Math.PI*radius*radius;
	}
	
class rectangle extends shape{
	
	double length, breadth;
	double perimeter() {
		return 2*(length+breadth);
	}
	double area() {
		return length*breadth;
	}
}
}

public class practice {
	
	public static void main(String arga[])
	{
	    shape c = new circle();
		
		System.out.println(c.area());
		System.out.print(c.perimeter());
	}

}
