package phase1.p1;

 public class M {
	 private static int m5 = 8;
	 static long m6 = 1234567;
	 protected static float m7 =12.4567890f;
	 public static void main(String[] args)
{
	
}
public void m1(){

        System.out.println("public method of class M");
		System.out.println("private int value is "+ m5);
		System.out.println(" protected float value is "+ m7);
		System.out.println("default long value is "+ m6);
}
 void m2()
{
	System.out.println("This is the default method of class M");
}
private void m3(){
	System.out.println("This is private method of class M");
}
 protected void m4(){
	 System.out.println("This is protected method of class M");
	 
 }
 
}
