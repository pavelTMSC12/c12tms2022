package p4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        new Account(12, new Integer(5));
        new Account("12", new Integer(5));
//        new Account(new Person(), new Integer(5));
//        persons
        List<String> objects = new ArrayList<>();

//        for (String object : objects) {
//            System.out.println(object);
//        }
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            String value = objects.get(i);
            if (i > 2) {
                temp.add(value);
            }
//            objects.remove(i);
            System.out.println(value);
        }
        System.out.println(temp);
//
//        for (Iterator<String> iterator = objects.iterator(); iterator.hasNext(); ) {
//            String next = iterator.next();
//            System.out.println(next);
//        }

        objects.add("123");
        objects.add("125");
        objects.add("127");
        objects.add("1");
        objects.add(1, "2323");
        Iterator<String> iterator = objects.iterator();
        String next = iterator.next();
        System.out.println(next);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //if () {
            iterator.remove();
            //}
        }


        System.out.println("objects isEmpty " + objects.isEmpty());

//        for (String object : objects) {
//            System.out.println(object);
//        }

        Set<String> sets = new HashSet<>();
        List<String> stringList = List.of("12", "23");
        sets.add("12");
        sets.add("15");
        sets.add("16");

        List<String> strings = new ArrayList<>(sets);
        strings.get(0);

        Iterator<String> iteratorSet = sets.iterator();
        while (iteratorSet.hasNext()) {
            System.out.println(iteratorSet.next());
            iteratorSet.remove();
        }
        System.out.println(sets.isEmpty());

    }
}
