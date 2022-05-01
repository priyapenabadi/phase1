package phase1.core.programs;

abstract class telephone
{
    abstract void lift();
    abstract void disconnected();
    
}

class smartTelephone extends telephone
{
    void lift()
    {

    }

    void disconnected()
    {

    }
}

public class Oops4
{
    public static void main(String[] args) 
    {
        telephone t=new smartTelephone();
        t.lift();
        t.disconnected();

    }
}
