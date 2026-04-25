abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}
class Car extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol/Diesel";
    }
    @Override
    int noOfWheels() {
        return 4;
    }
}
class Bike extends Vehicle {
    @Override
    String fuelType() {
        return "Petrol";
    }

    @Override
    int noOfWheels() {
        return 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car Details:");
        System.out.println("Fuel Type : " + car.fuelType());
        System.out.println("Wheels    : " + car.noOfWheels());
        
        Vehicle bike = new Bike();
        System.out.println("\nBike Details:");
        System.out.println("Fuel Type : " + bike.fuelType());
        System.out.println("Wheels    : " + bike.noOfWheels());
    }
}
