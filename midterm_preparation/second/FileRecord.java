package midterm_preparation.second;
import java.util.Objects;
public class FileRecord {
    private String name;
    private long size;
    private AccessLevel accessLevel;

    public FileRecord(String name,  long size , AccessLevel accessLevel){
        this.name = name;
        this.size = size;
        this.accessLevel = accessLevel;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getSize(){
        return size;
    }
    public void setSize(long size){
        this.size = size;
    }

    public AccessLevel getAccessLevel(){
        return accessLevel;
    }
    public void setAccessLevel(AccessLevel accessLevel){
        this.accessLevel = accessLevel;
    }
    @Override 

    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || obj.getClass() !=getClass()) return false;
        FileRecord filerecord = (FileRecord) obj;
        return getName().equals(filerecord.getName()) && getSize() == filerecord.getSize() && getAccessLevel() == filerecord.getAccessLevel();

    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(), getSize(), getAccessLevel());
    }
}