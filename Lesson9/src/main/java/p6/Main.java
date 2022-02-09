package p6;

import static p6.Season.ЗИМА;
import static p6.Sex.MALE;

public class Main {
    public static void main(String[] args) {

        Sex sex = null;
        System.out.println(sex == MALE);
        System.out.println(sex.equals(MALE));


        System.out.println(MALE.name());
        System.out.println(MALE.getMyName());
        System.out.println(MALE.parse("MALE").name());

        for (Sex value : Sex.values()) {
            System.out.print(value.name() + " ");
        }


        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
        System.out.println(dayOfWeek);
        System.out.println(DayOfWeek2.SUNDAY);

        int value = 1;
        Season season = getaVoid(value);
        switch (season) {
            case ЛЕТО:
                System.out.println("лето");
                break;
            case ЗИМА:
                System.out.println("зима");
                break;
        }

        System.out.println(ЗИМА.myValue);

        System.out.println(new Main().getClass().getSimpleName());

//        System.out.println(Season.ЗИМА);
//        Season season = Season.ЗИМА;
//        switch (season) {
//            case ЗИМА:
//                System.out.println("");
//                break;
//            case ЛЕТО:
//                System.out.println("");
//                break;
//        }
    }

    private static Season getaVoid(int value) {
        for (Season season : Season.values()) {
            if (season.myValue == value) {
                return season;
            }
        }
        return null;
    }
}
