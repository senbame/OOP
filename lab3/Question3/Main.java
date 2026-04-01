package lab3.Question3;

public class Main {
    public static void main(String[] args) {

        MyCollection<String> collection = new MyArrayCollection<>();

        collection.add("A");
        collection.add("B");
        collection.add("A");

        System.out.println(collection.size()); // 3
        System.out.println(collection.contains("A")); 

        collection.remove("A");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
