package lab3.Question2;

public interface Flyable extends Moveable {
    void fly(double dx, double dy, double dz);  // 3-D movement
    double getAltitude();
    void land();
}