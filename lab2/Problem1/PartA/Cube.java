package lab2.Problem1.PartA;

public class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side length can't be negative!");
        }
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}
