
public class Porsche implements Car , Property , Asset{
    @Override
    public void drive()
    {
        System.out.println("Porche  driving");
    }
    @Override
    public int value()
    {
        return 2000;
    }
    @Override
    public void message()
    {
        System.out.println("This Porsche belongs to Tracey");
    }
}