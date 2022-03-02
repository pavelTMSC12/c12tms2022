package p4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        persons
        List<String> objects = new ArrayList<>();
        objects.add("123");
        objects.add("123");
        objects.add("123");
        objects.add("1");
        Iterator<String> iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }


        System.out.println("objects isEmpty " + objects.isEmpty());

//        for (String object : objects) {
//            System.out.println(object);
//        }

        Set<String> sets = new HashSet<>();
        sets.add("12");
        sets.add("12");
        sets.add("12");
        Iterator<String> iteratorSet = sets.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
            iteratorSet.remove();
        }
        System.out.println(sets.isEmpty());

    }
}
