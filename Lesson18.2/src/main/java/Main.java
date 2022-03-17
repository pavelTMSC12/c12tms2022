import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        Calculator calculator = new Calculator();
        calculator.divide(12, 2);

        Set<Integer> integers = Set.of(-101);
        Set<Integer> collect = IntStream.of(1, 2, 3, 4).boxed().collect(Collectors.toSet());
        GenericClass<String, Set<String>, Integer> string = new GenericClass<>("String", new HashSet<>(), new Integer(1));
    }
}
