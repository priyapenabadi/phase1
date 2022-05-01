package phase1.core.programs;
import java.util.Iterator;
import java.util.LinkedList; 
public class CollectionAss3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");
        ll.addLast("December");
        ll.addFirst("January");
        ll.add(1, "March");
        ll.add(1, "February");
        ll.add(8, "september");
        ll.add(9, "October");
        ll.add(3, "April");
        ll.remove(7);
        ll.add(4, "May");
        System.out.println(ll);
        int count=0;
        for (String i:ll){
        	count++;
        	if(count%2==0){
        		System.out.println(i+" ");
        	}
        }
        System.out.println();
        int count1=0;
        for (String i:ll){
        	count++;
        	if(count%2!=0);{
        		
        
        	System.out.println(i+" ");
        	}	
        }
        Iterator itr=ll.iterator();
        while(itr.hasNext()){
        	System.out.println("list is"+ itr.next());
        }
        System.out.println(ll.getFirst()+ " "+ ll.getLast());
        System.out.println(ll.remove(9));
        System.out.println(ll.contains("December"));
        
	}

}
