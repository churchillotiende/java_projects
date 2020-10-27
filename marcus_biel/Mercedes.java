
public class Mercedes implements Car , Property , Asset{
    @Override
    public void drive()
    {
        System.out.println("Mercedes driving");
    }
    @Override
    public int value()
    {
        return 8000;
    }
    @Override
    public void message()
    {
        System.out.println("This Mercedes belongs to Tracey");
    }
}