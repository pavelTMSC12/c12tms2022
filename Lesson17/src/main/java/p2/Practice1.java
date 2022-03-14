package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
import java.util.function.*;

public class Practice1 {
    /*
    В JDK 8 вместе с самой функциональностью лямбда-выражений также было добавлено некоторое количество встроенных функциональных интерфейсов,
    которые мы можем использовать в различных ситуациях и в различные API в рамках JDK 8.
    В частности, ряд далее рассматриваемых интерфейсов широко применяется в Stream API - новом прикладном интерфейсе для работы с данными.
    Рассмотрим основные из этих интерфейсов:
    Predicate<T>
    Consumer<T>
    Function<T,R>
    Supplier<T>
    UnaryOperator<T>
    BinaryOperator<T>
     */

    public static void main(String[] args) {
//        List<String> strings = Arrays.asList(args).stream()
//                .filter(s -> person.getName().equals("Александр"))
//                .forEach(s -> System.out.printf(s,12));
        //Predicate
        //проверяет соблюдение некоторого условия. Если оно соблюдается, то возвращается значение true.
        // В качестве параметра лямбда-выражение принимает объект типа T
        Predicate<Integer> isPositive = t -> t > 0;

        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false

        //Consumer(что то принимает но ничего не возвращает)
        //выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

        //Supplier(ничего не принимает только возвращает)
        //не принимает никаких аргументов, но должен возвращать объект типа T:
        Supplier<User> userFactory = () -> {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());

        //Function(принимает T-type возвращает R-result)
        //представляет функцию перехода от объекта типа T к объекту типа R:
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов

        //BinaryOperator
        //принимает в качестве параметра два объекта типа T ,
        // выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiply.apply(10, -2)); // -20

        //UnaryOperator
        //принимает в качестве параметра объект типа T,
        // выполняет над ними операции и возвращает результат операций в виде объекта типа T:
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25
    }


}

@AllArgsConstructor
@Getter
@Setter
class User {
    private String name;
}
