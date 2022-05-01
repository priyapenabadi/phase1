package phase1.core.programs;

abstract class Vehicle
{       
    abstract void run();
    abstract void stop();
    abstract void display();

    int speed;
    long distance;

    public Vehicle()
    {
        this.speed=75;
        this.distance=120;
    }

    public Vehicle(int a ,long s)
    {

    }

    public void fuel(int a)
    {

    }

    public void fuel(float a ,String s )
    {

    }

    public void fuel(char a,int b)
    {

    }
}

class W2 extends Vehicle
{
    int speed;
    long distance;
    int nos_of_tyres;
    
    public W2()
    {
        this.speed=40;
        this.distance=20;
        this.nos_of_tyres=2;
    }
    
    public void run()
    {

    }

    public void stop()
    {

    }

    public void display()
    {
        System.out.println(speed+"   "+ distance+ "   "+ nos_of_tyres+ "   "+ super.speed+"   "+ super.distance);
    }

}

class W3 extends Vehicle
{
    int speed;
    long distance;
    int nos_of_tyres;
    
    public W3()
    {
        this.speed=60;
        this.distance=25;
        this.nos_of_tyres=3;
    }
    
    public void run()
    {

    }

    public void stop()
    {

    }

    public void display()
    {
        System.out.println(speed+"   "+ distance+ "   "+ nos_of_tyres+ "   "+ super.speed+"   "+ super.distance);
    }

}

class W4 extends Vehicle
{
    int speed;
    long distance;
    int nos_of_tyres;
    
    public W4()
    {
        this.speed=45;
        this.distance=70;
        this.nos_of_tyres=4;
    }
    
    public void run()
    {

    }

    public void stop()
    {

    }

    public void display()
    {
        System.out.println(speed+"   "+ distance+ "   "+ nos_of_tyres+ "   "+ super.speed+"   "+ super.distance);
    }

}

class W8 extends Vehicle
{
    int speed;
    long distance;
    int nos_of_tyres;
    
    public W8()
    {
        this.speed=65;
        this.distance=53;
        this.nos_of_tyres=8;
    }
    
    public void run()
    {

    }

    public void stop()
    {

    }

    public void display()
    {
        System.out.println(speed+"   "+ distance+ "   "+ nos_of_tyres+ "   "+ super.speed+"   "+ super.distance);
    }

}

public class Oops1
{
    public static void main(String args[])
    {
        Vehicle v;
        v=new W2();
        v.display();
        v=new W3();
        v.display();
        v=new W4();
        v.display();
        v=new W8();
        v.display();
    }
}
