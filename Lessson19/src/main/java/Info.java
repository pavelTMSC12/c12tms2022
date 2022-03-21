import java.util.*;
import java.util.stream.Collectors;

public class Info {
    //https://stackoverflow.com/questions/29406286/how-to-best-create-a-java-8-stream-from-a-nullable-object


    public static void main(String[] args) {
//        String str = "123";
//        System.out.println(Optional.of(str).isPresent());
//        String test = test();
//        if (test != null) {
//            System.out.println(test);
//        }
        Person person = new Person();
        test().ifPresent(name -> person.setName(name));
        Integer[] integers = {};
        List<String> personNames = Optional.ofNullable(test2())
//                .orElse(new ArrayList<>(0))
                .orElseGet(Collections::emptyList)
                .stream()
                .map(user -> user.getName())
                .collect(Collectors.toList());
        for (String personName : personNames) {
            System.out.println(personName);
        }

        List<Person> personList = test2();
        if (personList != null && !personList.isEmpty()) {
            for (Person person1 : personList) {

            }
        }

        System.out.println(getDouble(integers));

    }

    private static double getDouble(Integer[] integers) {
        return Arrays.stream(integers)
                .mapToInt(value -> value)
                .average()
                .orElse(0.0);
    }

    private static List<Person> test2() {
        if (true) {
            return new ArrayList<>();
        }
        return null;
    }

    private static Optional<String> test() {
        if (5 > 7) {
            return Optional.of("tst");
        }
        return Optional.empty();
    }

}
