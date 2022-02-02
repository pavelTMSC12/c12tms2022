package by.tms.my_model;

public class Person {
    private String name; //характиристики, свойства
    private int age;

    private Person() {//конструктор
        System.out.println(name + age);
    }

    public void test() {
        print();
    }

    //методы по работе с Person
    private void print() {
        System.out.println(name + age);
    }
}
