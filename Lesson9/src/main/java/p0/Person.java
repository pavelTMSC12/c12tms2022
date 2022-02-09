package p0;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private String sex;
}
