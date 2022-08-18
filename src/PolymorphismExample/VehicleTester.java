package PolymorphismExample;

public class VehicleTester {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Boat();
        vehicles[2] = new Plane();

        for(Vehicle v : vehicles){
            v.speed();
        }
    }
}
