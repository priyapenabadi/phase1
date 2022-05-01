package phase1.core.programs;

import java.util.regex.*;
public class RegexAssg
{
	public static boolean isValidPassword(String s_2){
		String regex = "[A-Z]{1}[0-9]{3}[a-zA-Z]${10}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s_2);
		return (m.matches());
	}
    public static void main(String[]args)
    {
    	String s_2 = "AKH112adv";
    	
    	if(isValidPassword(s_2))
			System.out.println("valid password");
		else
			System.out.println("Invalid password");
        System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.com]", "firstname@gmail.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.com]", "virendra@gmail.com"));
        System.out.println(Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.com]", "test123prepare@co.edu.com"));
        System.out.println(Pattern.matches("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$", "+918132528590"));
    }
}
