package phase1.core.programs;

public class Stringscompare {

	public static void main(String[] args) {
		String o = "Mumbai";
		String l = new String ("Delhi");
		String t ="Delhi";
        String k = "delhi";
        String y = new String("delhi");
		String p = new String("Hello");
		
		if(o.equals(l))
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		if(o==(l)) 
		{
			System.out.println("true");
		
		}
		else {
			System.out.println("false");
		}
		if(y.equals(p))
		{
			System.out.println("true");
		}
		else{
			System.out.println("false");
			
		}
		if(y==(p))
		{
			System.out.println("true");
			
		}
		else{
			System.out.println("false");
		}
		
		
        if(t.equals(o))
        {
        	System.out.print("true");
        }
        else{
        	System.out.print("false");
        }
        
        if(t==(o))
        {
        	
        	System.out.println("true");
        	
        }
        else{
        	System.out.println("false");
        }
        
        if(k.equals(y))
        {
        	System.out.print("true");
        }
        else{
        	System.out.print("false");
        }
        
  
        if(k==(y))
        {
        	System.out.println("true");
        }
        else{
        	System.out.println("false");
        }
        if(p.equals(y))
        {
        	System.out.println("true");
        }
        
        else{
        	System.out.println("false");
        }
        if(p==(y))
        {
        	System.out.println("true");
   
        }
        else {
        	System.out.println("false");
        }
	}

}
