package phase1.core.programs;

class Monkey
{
    public void jump()
    {

    }

    public void bite()
    {

    }


}

class human extends Monkey
{
    public void eat()
    {

    }

    public void sleep()
    {

    }

}

public class Oops3
{
    public static void main(String[]args)
    {
        Monkey m=new human();
        m.jump();
        m.bite();
        ((human) m).eat();
        ((human) m).sleep();
        
    }
}
