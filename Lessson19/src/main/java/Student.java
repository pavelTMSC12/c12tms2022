import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    private String name;
    private String group;
    private int numberOfCourse;
    private int[] metrics;
    private boolean hasNext;
    private int m = 3;

    public Student(String name, String group, int... metrics) {
        this.name = name;
        this.group = group;
        this.metrics = metrics;
    }
}