import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class nyapalaTest
{
    @Test
    public void shouldReturnNyapala()
    {
        nyapala greg = new nyapala();
        assertEquals("hello nyapala", greg.helloNyapala("nyapala;"));
    }
}