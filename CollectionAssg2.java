package phase1.core.programs;

import java.util.TreeSet;

public class CollectionAssg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("C");
		ts.add("Java");
		ts.add("Sql");
		ts.add(".Net");
		ts.add("MySql");
		ts.add("C++");
		
		System.out.println("Before removing elements :\n"+ts);
		
		ts.remove("C");
		ts.remove("Sql");
		
		System.out.println("After removing two elements :\n"+ts);
		
		ts.add("Apache");
		ts.add("Spring");
		ts.add("MOngDb");
		
		System.out.println("Is java present in treeset :\n"+ts.contains("Java"));
		System.out.println("After adding 3 more elements to the treeset :\n"+ts);
		
		ts.clear();
		System.out.println("After removing all the elements from the treeset :\n" + ts);
	}

}
