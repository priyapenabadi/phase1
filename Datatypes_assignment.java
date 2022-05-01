package phase1.core.programs;

public class Datatypes_assignment {

	public static void main(String[] args) {
		char A = 'J';
		int r = 14;
		float p = 456.9822f;
		long d = 123455678;
		double c =756654.876786876;
		byte b;
		System.out.println("conversion of char to int");
		r = A;
		System.out.println("A = " + A +  " r = " + r);
		System.out.println("\nconversion of int to float");
		p = (float) r;
		System.out.println("r = " + r + " p = " + p);
		System.out.println("\nconversion of float to long");
		d = (long)  p;
		System.out.println("p = " + p + " d = " + d);
		System.out.println("\nconversion of long to char");
		A = (char) d;
		System.out.println("d = " + d + " A = " + A);
		System.out.println("\nconversion of double to int");
		r = (int) c;
		System.out.println("c = " + c + " r = " + r);
		System.out.println("\nconversion of int to long");
		d = r;
		System.out.println("r =" + r + " d = " + d);
		System.out.println("\nconversion of long to byte");
		b = (byte) d;
		System.out.println("d = " + d + " b = " + b);
		
		
		
		
		
		
		
		
		

	}

}
