package phase1.core.programs;
import java.util.*;
public class Constructor3 {
		String name;
		int age;
		char section;
		char gender;
		static int sub1=0;
		public Constructor3()
		{
			name="priya";
			age=21;
			section='b';
			gender='f';
		}
		
		public Constructor3 (String name,int age,char section,char gender)
		{
			this.name=name;
			this.age=age;
			this.section=section;
			this.gender=gender;
			
		}
		public void calculate(int sub1,int sub2,int sub3) 
		{

			int sum=0;
			sum=sub1+sub2+sub3;
			float percent=(float)((sum/3));
			System.out.println("Sum of the student" + name + " marks is : "+sum);
			
			System.out.println("Percentage of the student "+name+" is : "+percent);
		}
	public static void main(String[] args) 
	{
   Scanner scan=new Scanner(System.in);
		
		Constructor3 s1=new Constructor3("priya",21,'A','F');
		s1.calculate(75, 82, 59);
		Constructor3 s2=new Constructor3("hari",21,'B','M');
		s2.calculate(sub1,76, 85);
		Constructor3 s3=new Constructor3("mani",20,'C','M');
		s3.calculate(sub1, 98, 65);
		Constructor3 s4=new Constructor3("ria",21,'A','F');
		s4.calculate(98, 65, 45);
		
	}
}
	


