package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(1));
        arrayList.add(new Long(34));
        arrayList.add(new Boolean(true));

        System.out.println(Arrays.toString(objects));

        List<String> objects1 = new ArrayList<>();
        objects1.add("sadas");
        objects1.add("2323");
        objects1.add("2323");
        objects1.add("2323");
        objects1.add("2323");
        objects1.set(2, "!!!");

        objects1 = new LinkedList<>();

        System.out.println(objects1);
    }
}
