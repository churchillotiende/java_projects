
public abstract class Animal
{
    /*
        When using interfaces we need not to declare methods as 
        either public or abstract while in inheritance we have to 
        make them abstract plus even the class
    */
    public abstract void eat();

    public String grow()
    {
        return "The animal is growing";
    }

}