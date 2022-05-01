package phase1.core.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionAssg1 {

	 public static void main(String[] args) 
	    {
	        Set<String> set=new HashSet<String>();
	        
	        set.add("1");
	        set.add("2");
	        set.add("3.14");
	        set.add("4.2");
	        set.add("A");
	        set.add("G");
	        set.add("True");

	        Scanner sc=new Scanner(System.in);

	        Set<Integer> set1=new HashSet<Integer>();

	        int i=0;
	        while(i<=8)
	        {
	            i=sc.nextInt();
	            set1.add(i);
	            i++;
	        }

	        System.out.println("Set1 : "+set);
	        System.out.println("Set2 : "+set1);
	    }
	}
