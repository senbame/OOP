package lab3.Question2;

public class Drone implements Flyable {
    private String model;
    private double x, y, altitude;

    public Drone(String model) { this.model = model; }

    
    @Override 
    public void   move(double dx, double dy) { x += dx; y += dy; }

    @Override 
    public double getX()       { return x; }
    
    @Override 
    public double getY()       { return y; }

    @Override 
    public void fly(double dx, double dy, double dz) {
        x += dx; y += dy; altitude += dz;
    }
    @Override 
    public double getAltitude() { return altitude; }

    @Override 
    public void   land()        { altitude = 0; }

    @Override 
    public String toString() {
        return model + " at (" + x + "," + y + ") alt=" + altitude;
    }
}