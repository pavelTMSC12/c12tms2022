import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Andrey", "Informatics", 3, 2, 1, 4),
                new Student("Ivan", "Informatics", 3, 2, 3, 4),
                new Student("Vladimir", "Informatics", 4, 3, 4, 5),
                new Student("Vlad", "Informatics", 2, 4, 5, 6)
        );
        Map<String, Double> collect = studentList.stream()
                .collect(groupingBy(Student::getName,
                        mapping(student -> Stream.of(student.getM(), student.getM()).collect(toList()),
                                averagingDouble(value -> value.stream().collect(Collectors.averagingDouble(Integer::doubleValue))
                                )))
                );

        System.out.println(collect);
//        double avg = getAverage(integerList);
//        System.out.println(avg);
    }

//    private static double getAverage(List<Integer> list) {
//        IntSummaryStatistics stats = list.stream()
//                .mapToInt(Integer::intValue)
//                .summaryStatistics();
//        return stats.getAverage();
//    }
}
