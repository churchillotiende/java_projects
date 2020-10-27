import org.junit.Test;


public class TinasheTest 
{
    @Test
    // For each loop
    public void shouldDemoForEachLoop()
    {
        Tinashe [] tinashes = new Tinashe[4];
        for(Tinashe tina : tinashes)
        {
            tina = new Tinashe();
            System.out.println(tina.helloWorld("Churchill"));
        }
    }
}