package lab3.Question1;

public @interface Interface {
    // Use an Interface when:
    // 1. You want to define a CONTRACT (what an object CAN DO) without implementation
    // 2. You need MULTIPLE INHERITANCE (a class can implement many interfaces)
    // 3. Unrelated classes need to share a common behaviour
    

    public interface Printable {
        void print();           // abstract by default
        default void printTwice() { print(); print(); }  
    }

    public interface Serializable {
        String serialize();
    }

    public class Invoice implements Printable, Serializable {
        private String data;
        public Invoice(String d) { this.data = d; }
        @Override public void print() { System.out.println("Invoice: " + data); }
        @Override public String serialize() { return "{\"data\":\"" + data + "\"}"; }
    }

    public class Photo implements Printable, Serializable {
        private String filename;
        public Photo(String f) { this.filename = f; }
        @Override public void print() { System.out.println("Photo: " + filename); }
        @Override public String serialize() { return "{\"file\":\"" + filename + "\"}"; }
    }
}
