package lab2.Problem1.PartC;
import java.util.Objects;
public class Plane extends Transport {
    private int altitude;

    public Plane(String manufacturer, int speed, int capacity, int altitude) {
        super(manufacturer, speed, capacity);
        this.altitude = altitude;
    }
    public int getAltitude() {
        return altitude;
    }
    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
    
    @Override
    public String toString() {
        return "Plane [altitude=" + altitude + ", manufacturer=" + getManufacturer() + ", speed=" + getSpeed() + ", capacity=" + getCapacity() + "]";
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Plane)) return false;

        Plane other = (Plane) obj;
        return this.altitude == other.altitude && super.equals(other);

    }
    @Override
    public int hashCode(){
        return Objects.hash(getAltitude(), super.hashCode());
}
}
