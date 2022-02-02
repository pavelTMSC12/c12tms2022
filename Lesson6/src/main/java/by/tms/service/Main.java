package by.tms.service;

import by.tms.my_model.Car;
import by.tms.utils.Constants;

import static by.tms.utils.Constants.MIN_AGE;

public class Main {


    /**
     * Создает объект класса Машина и Человек
     *
     * @param args
     */
    public static void main(String[] args) {

        Car car2 = new Car("sfsdf", 1213);

//        car2.
//        Car car2 = new Car();
//        car2.setName("бмв");
//        car2.setYear(1995);

//        System.out.println(Constants.TEMP);

        int age = 23;
//        Constants constants = new Constants();

        if (age > MIN_AGE && age < Constants.MAX_AGE) {
            System.out.println("призывник");
        }

        Car car = new Car("qweqw", 123);//


//        Car car3 = new Car("красный");
//        car3.setColor("красный");

        System.out.println(car);
        p2.Car car1 = new p2.Car("бмв", "красный", "двс");

//        car.name = "бмв";
//        person.age = 34;
//        person.name = "Ivan";
//        System.out.println("Возраст " + person.age);//0
//        System.out.println("Имя" + person.name);
//        Person person = new Person();
//        Person p1 = new Person();
//        System.out.println(person);
//        System.out.println(p1);
        test();
//        summ2(5, 6);
    }

//    private static int summ2(int a, int b) {
//        int result = 0;
//        if (a == 0 || b == 0) {
//            return 0;
//        }
//        while (Math.abs(b) != 0) {
//            result -= a;
//            b++;
//        }
//        return result;
//    }

    private static void test() {
        System.out.println("sdf");
    }
}

