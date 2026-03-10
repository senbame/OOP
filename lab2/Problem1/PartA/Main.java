package lab2.Problem1.PartA;

public class Main {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(4, 3.2);
        System.out.print("Volume of Cylinder: ");
        System.out.println(cylinder.volume());
        System.out.print("Area of Surface of Cylinder: ");
        System.out.println(cylinder.surfaceArea());

        Cube cube = new Cube(5.5);
        System.out.print("Volume of Cube: ");
        System.out.println(cube.volume());
        System.out.print("Area of Surface of Cube: ");
        System.out.println(cube.surfaceArea());

        Sphere sphere = new Sphere(2.5);
        System.out.print("Volume of Sphere: ");
        System.out.println(sphere.volume());
        System.out.print("Area of Surface of Sphere: ");
        System.out.println(sphere.surfaceArea());

    }
}
