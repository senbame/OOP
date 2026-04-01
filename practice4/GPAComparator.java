package practice4;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.getGpa(), b.getGpa());
    }
}