import Service.ServiceStation;
import Transport.Bicycle;
import Transport.Car;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Кама", 2);
        Car car = new Car("Лада", 4);
        Truck truck = new Truck("Урал", 6);
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);
    }
}