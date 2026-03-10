package midterm_preparation.second;

import java.util.HashSet;
public class Drive {
    String ownerName;
    HashSet<FileRecord> files;

    public Drive(String ownerName){
        this.ownerName = ownerName;
        this.files = new HashSet<>();
    }

    public void add(FileRecord file){
        files.add(file);
        }
    public void print(){
        System.out.println("Owner: " + ownerName);

        for (FileRecord file : files){
            System.out.println("File Name: " + file.getName() + ", Size: " + file.getSize() + ", Access Level: " + file.getAccessLevel());
        }
    }
}
