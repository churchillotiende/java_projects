
public class BMW implements Car , Asset , Property{
    @Override
    public void drive()
    {
        System.out.println("BMW driving");
    }
    @Override
    public int value()
    {
        return 8000;
    }
    @Override
    public void message()
    {
        System.out.println("This BMW belongs to Tracey");
    }

}