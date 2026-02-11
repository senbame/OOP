package practice2;

public class Student {
    private final String name;
    private final int id;
    private static int nextID = 1;
    int studyYear;

    public Student(String name) {
        this.name = name;
        this.id = nextID++;
        this.studyYear = 2025;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void increaseStudyYear() {
        studyYear++;
    }


    public static void main(String[] args) {
        Student student = new Student("Alisher");
        student.increaseStudyYear();
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.studyYear);
    }
}