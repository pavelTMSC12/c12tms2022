package hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class L18 {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        //Сделать Stream из System.in
//        Map<String, Long> map = reader
//                .lines()
//                .limit(1)
        Map<String, Long> map = Arrays.stream("df df  4 4  43d asd sd f g ggg".split("[\\p{Blank}\\p{Punct}]+"))
//                .flatMap(s -> Arrays.stream(s.split("[\\p{Blank}\\p{Punct}]+"))
//                        .flatMap(String::lines))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        // Сложить в ХЭШ сразу с подсчетом вхождений


//
//        // Сортируем, ограничиваем кол-во, берем ключ и выводим
        map.entrySet().stream()

                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .sorted(Map.Entry.comparingByKey())
//                .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue)
//                        .reversed()  // Обратная сортировка по количеству
//                        .thenComparing(Map.Entry::getKey))  // потом прямая по словам
                .limit(3)
                .forEach(s -> System.out.printf("%s - %s\n", s.getKey(), s.getValue()));
    }
}
