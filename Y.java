package phase1.p2;

import phase1.p1.M;
import phase1.p1.N;
class Y extends N
{
	
 
	public static void main(String[] args) {
		
		new M ().m1();
		
		new N().n1();
		
		
		X obj = new X();
		System.out.println("variable in X x2 = " + obj.x2);
		System.out.println("variable in X  x3 = " + obj.x3);
		System.out.println("variable in X  x4 = " + obj.x4);
	}
	}
