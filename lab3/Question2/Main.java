package lab3.Question2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 0, 0);
        Drone drone = new Drone("DJI");

        System.out.println(car);   // Toyota at (0.0,0.0)
        System.out.println(drone); // DJI at (0.0,0.0) alt=0.0

        car.move(10, 5);
        drone.fly(5, 5, 10);

        System.out.println(car);   // Toyota at (10.0,5.0)
        System.out.println(drone); // DJI at (5.0,5.0) alt=10.0

        drone.land();
        System.out.println(drone); // DJI at (5.0,5.0) alt=0.0
    }
}
