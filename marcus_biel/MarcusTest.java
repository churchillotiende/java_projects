import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MarcusTest {
    @Test
    public void shouldReturnHelloMarcus()
    {
        marcus marc = new marcus();
        assertEquals("Hello Marcus", marc.hello("Marcus"));
    }
}