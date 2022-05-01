package phase1.core.programs;


public class Methodoverload {

	public void calculate(int a, int b)
	
	{
		int c = (a+b);
		System.out.println("add = " + c);
	}
	public void calculate(float r){
		System.out.println("area of circle = " +(3.14*r*r));
	}
	public void calculate(double l, long h){
		System.out.println("area of rectangle = " + (l*h));
	}

	public static void main(String[] args) {
		Methodoverload obj=new Methodoverload();
		obj.calculate(5,6);
		obj.calculate(9.67568f);
		obj.calculate(7.98654678,65714563);
		
	

	}

}
