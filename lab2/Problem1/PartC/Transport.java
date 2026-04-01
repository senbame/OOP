package lab2.Problem1.PartC;

// import java.util.Objects;

public class Transport {
    private String manufacturer;
    private int speed;
    private int capacity;

    public Transport(String manufacturer, int speed, int capacity) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.capacity = capacity;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Transport [manufacturer=" + manufacturer + ", speed=" + speed + ", capacity=" + capacity + "]";
    }
    // @Override
    // public boolean equals(Object obj){
    //     if (this == obj) return true;
    //     if (!(obj instanceof Transport)) return false;

    //     Transport other = (Transport) obj;
    //     return this.manufacturer.equals(other.manufacturer) && this.speed == other.speed && this.capacity == other.capacity;
    // }
    // @Override
    // public int hashCode(){
    //     return Objects.hash(getManufacturer(), getSpeed(), getCapacity());
    // }
}

