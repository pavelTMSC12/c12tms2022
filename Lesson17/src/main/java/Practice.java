import p3.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

public class Practice {


    public static void main(String[] args) {


        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> notContainsA = containsA.negate();

        Predicate<String> containsB = t -> t.contains("B");
        System.out.println(containsA.and(containsB).test("ABCD"));

        Map<Integer, String> collect = IntStream.of(1, 2, 3, 4, 1011)
                .boxed()
                .collect(toMap(integer -> integer, Object::toString));


        System.out.println(collect);


        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Nikolay", 4, "male");
        person1.setStringList(List.of("sdf", "sdf"));
        personList.add(person1);
        personList.add(new Person("Alex", null, "male"));
        personList.add(new Person("Alex", 9, "male"));

        Map<Long, Person> map = personList.stream()
                .collect(toMap(person -> person.getId(), person -> person));
        Person person2 = map.get(1);

        personList.stream()
//                .flatMap(person -> person.getStringList().stream())
                .allMatch(s -> s.getName().equals("Александр"));
//                .forEach(System.out::print);


//        Stream<String> distinct = personList.stream()
//                .map(p3.Person::getName)
//                .sorted()
//                .distinct()
//                .collect(Collectors.toList())
//        distinct.collect(Collectors.toList());

        Optional<Integer> maxPersonAge = findMaxPersonAge(personList);
        if (maxPersonAge.isPresent()) {
            Integer maxAge = maxPersonAge.get();
            System.out.println(maxAge);
        }
//        Integer maxPersonAge = findMaxPersonAge(personList);
//        if (maxPersonAge != null) {
//            System.out.println(maxPersonAge.hashCode());
//        }

//        getPersonAges(personList);

        //

//        maxPersonAge.ifPresent(System.out::println);

//        Optional.empty();

//        System.out.println(collect);


        //list.forEach(System.out::println);

//        list.forEach(System.out::println);

//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        Optional<Integer> min = numbers.stream().min(Integer::compare);
//        Random rnd = new Random();
//        System.out.println(min.orElseGet(()->rnd.nextInt(100)));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        Optional<Person> min = personList.stream().findFirst();

        final Consumer<Person> consumer = v -> {
            v.setAge(v.getAge() + 100);
        };
        Consumer<Person> integerConsumer = v -> {
            System.out.println(v);
        };
        min.ifPresentOrElse(
                consumer.andThen(integerConsumer),
                () -> System.out.println("Value not found")
        );

//        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
////        printUpperCase.accept("hello");
//
//        Consumer<String> printLowerCase = str -> System.out.println(str.toLowerCase());
//        printUpperCase.andThen(printLowerCase).accept("Hello world");
    }

    private static void test() {

    }

    private RuntimeException createException(String message) {
        return new RuntimeException(message);
    }


    private static Integer getPersonAges(List<Person> personList, Person defaultPerson) {
        Optional<Integer> max = personList.stream()
                .map(Person::getAge)
                .filter(Objects::nonNull)
                .filter(age -> age > 10)
                .max((o1, o2) -> o1.compareTo(o2));
        max.ifPresentOrElse(System.out::println, () -> {
            System.out.println("null");
        });

        return max;
//                .orElseGet(()->defaultPerson.getAge());
//                .orElseThrow(() -> new RuntimeException("dasfdasf"));
//                ;


//        for (p3.Person person : personList) {
//            if (person.getAge() > 10) {
//                return person.getAge();
//            }
//        }
//        return null;

//                .orElseGet();
//                .orElseThrow();
//        if (max.isPresent()) {
//            if (max.get() > 10) {
//                return max;
//            }
//        }
//        return Optional.empty();
    }


}
