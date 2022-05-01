package phase1.core.programs;

class MycustomException extends Exception
{
	public MycustomException(String str){
		super(str);
	}
}
class MycustomException1 extends Exception{
	public MycustomException1(String str){
		super(str);
	}
}
class MycustomException2 extends Exception{
	public MycustomException2(String str){
		super(str);
	}
}

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int sal = 2103;
                try{
                	if(sal<2100)
                		throw new MycustomException("you need to work hard");
                	else if(sal>2100 && sal<5000)
                		throw new MycustomException1("your salary is somehow good");
                	else if(sal>2100 && sal<5000)
                		throw new MycustomException2("your salary is somehow good");
                	else if(sal>5000 && sal<9000)
                		throw new MycustomException2("salary is very good");
                }
                catch (MycustomException ex){
                	System.out.println(ex);
                }
                catch (MycustomException1 ex){
                	System.out.println(ex);
                }
                catch (MycustomException2 ex){
                	System.out.println(ex);
                }
	}

}
