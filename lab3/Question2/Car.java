package lab3.Question2;

public class Car implements Moveable {
    private String brand;
    private double x, y;

    public Car(String brand, double x, double y) {
        this.brand = brand; 
        this.x = x; 
        this.y = y;
    }

    @Override 
    public void   move(double dx, double dy) { x += dx; y += dy; }

    @Override 
    public double getX() { return x; }
    
    @Override 
    public double getY() { return y; }

    @Override 
    public String toString() {
        return brand + " at (" + x + "," + y + ")";
    }
}