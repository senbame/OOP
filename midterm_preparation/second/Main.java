package midterm_preparation.second;

public class Main {
    public static void main (String[] args){
        Drive drive = new Drive("Alice");
        FileRecord file1 = new FileRecord("file1.txt", 1024, AccessLevel.PUBLIC);
        FileRecord file2 = new FileRecord("file2.txt", 2048, AccessLevel.PRIVATE);
        FileRecord file3 = new FileRecord("file3.txt", 4096, AccessLevel.PROTECTED);

        drive.add(file1);
        drive.add(file2);
        drive.add(file3);

        drive.print();
    }
}
