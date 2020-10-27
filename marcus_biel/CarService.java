
public class CarService {
    public void drive()
    {
        Car [] cars = {new BMW() , new Porsche() , new Mercedes()};
        for(Car car:cars)
        {
            car.drive();
        }
        
    }
    public void value()
    {
        Asset [] assets = {new BMW() , new Porsche() , new Mercedes()};
        for(Asset asset:assets)
        {
            asset.value();
        }
    }
    public void message()
    {
        Property [] properties = {new BMW() , new Porsche() , new Mercedes()};
        for(Property property:properties)
        {
            property.message();
        }
    }

}