package lab2.Problem1.PartC;
import java.util.HashSet;
public class Main {
    public static void main(String[] args){
        HashSet<Transport> transports = new HashSet<>();
        transports.add(new Plane("Boeing", 800, 300, 10000));
        transports.add(new Plane("Airbus", 900, 400, 12000));
        transports.add(new Plane("Boeing", 800, 300, 10000));


        for(Transport plane : transports){

            System.out.println(plane.hashCode());
        }
        System.out.println(transports.size());
    }
}
