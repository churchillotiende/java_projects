import org.junit.Test;


public class CarServiceTest {
    @Test
    public void shouldDemoInterfaces()
    {
        CarService carService = new CarService();
        carService.drive();
        carService.value();
        carService.message();
    }
}