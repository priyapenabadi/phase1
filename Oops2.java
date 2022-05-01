package phase1.core.programs;

abstract class MNC
{
    public MNC()
    {

    }
    
    abstract void method1();
    abstract void method2();
    abstract void method3();
    public void normal_method1()
    {

    }

	public void normal_method2() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Infosys extends MNC
{
    abstract void method3();
}

class Hello extends Infosys
{
    void method1()
    {

    }

    void method2()
    {

    }

    void method3()
    {

    }

    public void normal_method2()
    {

    }
}

public class Oops2
{
    public static void main(String args[])
    {
        MNC m;
        m=new Hello();
        m.method1();
        m.method2();
        m.method3();
        m.normal_method1();
        m.normal_method2();  
    }
}
