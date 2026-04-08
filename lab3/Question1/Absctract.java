package lab3.Question1;

public class Absctract {
    // Use an Abstract Class when:
    // 1. You want to share CODE (partial implementation) among related classes
    // 2. Classes share state (fields) as well as behaviour
    // 3. You want to use non-public (protected) members
    // 4. There is a clear IS-A hierarchy and a common base makes sense

    public abstract class Shape {
        protected String colour;     
        public Shape(String colour) { this.colour = colour; }

        public String getColour() { return colour; }

       
        public abstract double area();
        public abstract double perimeter();

        public void describe() {
            System.out.printf("Shape[%s] area=%.2f perimeter=%.2f%n",
                            colour, area(), perimeter());
        }
    }

    public class Circle extends Shape {
        private double radius;
        public Circle(String c, double r) { super(c); this.radius = r; }
        @Override public double area()      { return Math.PI * radius * radius; }
        @Override public double perimeter() { return 2 * Math.PI * radius; }
    }

    public class Rectangle extends Shape {
        private double w, h;
        public Rectangle(String c, double w, double h) { super(c); this.w=w; this.h=h; }
        @Override public double area()      { return w * h; }
        @Override public double perimeter() { return 2 * (w + h); }
    }

}
