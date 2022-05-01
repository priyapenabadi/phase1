package phase1.p1;

public class P {

	public static void main(String[] args)
	{
		new M ().m1();
		new M().m2();
		new M().m4();
		
		new N().n1();
		new N().n2();
		new N().n4();
	}
	void p1(){
		System.out.println("default method of P");
	}
	public void p2(){
		System.out.println("public method of P");
	}
protected void p3(){
	System.out.println("protected method of P");
}
private void p4()
{
	System.out.println("private method of class P");
	}
}
