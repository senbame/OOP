package lab3.Question4;
public class Person {
    protected String name;

    public Person(){
        this("Unknown"); }

    public Person(String name){
        this.name = name; }

    public    String getName()         { return name; }
    public    void   setName(String n) { this.name = n; }

    @Override 
    public String  toString()     { return "Person{" + name + "}"; }

    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        return name.equals(((Person) o).name);
    }
    @Override 
    public int hashCode() { return name.hashCode(); }
}