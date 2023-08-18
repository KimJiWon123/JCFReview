package sit.int202.jcfreview;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString()
@EqualsAndHashCode

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpax;
    public static final Comparator<Student> SORT_BY_GPAX = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getGpax() < o2.getGpax()) {
                return 1;
            }else if (o1.getGpax() > o2.getGpax()) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    };

    public static final Comparator<Student> SORT_BY_NAME = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            {
                return o1.getName().compareTo(o2.getName());
            }
        }
    };

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
