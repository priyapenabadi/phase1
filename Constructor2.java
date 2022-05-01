package phase1.core.programs;

import java.lang.Math;
import java.util.*;
public class Constructor2 {
	 static int square_area;
		static  int rectangle_area;
		 static float circle_area;
		 static int triangle_area;
		 static float rhombus_area;
		
		public Constructor2()
		{
			
			System.out.println("This is my default constructor");
		
		}
		public Constructor2(int a)
		{
			
			square_area=a*a;
		}
		public Constructor2(int length,int width)
		{
			rectangle_area=length*width;
		}
		public Constructor2(float radius)
		{
			circle_area=(float) ((Math.PI)*(radius*radius));
		}
		//method for displaying the areas of square,rectangle,circle
		public void display()
		{
			System.out.println("The area of square is : "+square_area);

			System.out.println("The area of rectangle is : "+rectangle_area);

			System.out.println("The area of circle is : "+circle_area);
		}
		public float calculate(float base,float height)
		{
			rhombus_area=((base*height)/2);
		
			return rhombus_area;
		}
		public int calculate(int d1,int d2 )
		{
			triangle_area=((d1*d2)/2);
			return triangle_area;

		}

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the side area for square");
		int side_area_square=scan.nextInt();
		
		System.out.println("enter the length and width for rectangle");
		int length=scan.nextInt();
		int width=scan.nextInt();
		
		System.out.println("enter the radius  for circle");
		float radius=scan.nextFloat();
		
		System.out.println("enter the height and base  for triangle");
		float height=scan.nextFloat();
		float base=scan.nextFloat();
		

		System.out.println("enter the diagnol1 and diagonal2  for triangle");
		int d1=scan.nextInt();
		int d2=scan.nextInt();
		
		scan.close();
		
		
		Constructor2 a2=new Constructor2();
		Constructor2 a3=new Constructor2(side_area_square);
		Constructor2 a4=new Constructor2(length,width);
		Constructor2 a5=new Constructor2(radius);
		a5.display();
	
		
		System.out.println("The area of rhombus is :"+a5.calculate(height,base));
		
		System.out.println("The area of triangle is :"+a5.calculate(d1,d2));
	}


	}


