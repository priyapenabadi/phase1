package phase1.core.programs;

abstract class marks
{
    abstract int getPerccentage();
}

class A extends marks
{
    int m1,m2,m3;
    public A(int a,int b,int c)
    {
        this.m1=a;
        this.m2=b;
        this.m3=c;
    }
    int getPerccentage()
    {
        return ((m1+m2+m3)*100)/300;
    }
}

class B extends marks
{
    int m1,m2,m3,m4;
    public B(int a,int b,int c,int d)
    {
        this.m1=a;
        this.m2=b;
        this.m3=c;
        this.m4=d;
    }

    int getPerccentage()
    {
        return ((m1+m2+m3+m4)*100)/400;
    }
}

public class Constructor4
{
    public static void main(String [] args)
    {
        A a=new A(87,79,93);
        B b=new B(96,93,84,88);
        System.out.println(a.getPerccentage());
        System.out.println(b.getPerccentage());
    }
}