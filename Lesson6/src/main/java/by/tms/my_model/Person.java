package by.tms.my_model;

public class Person {
    private String name; //характиристики, свойства
    private int age;

    public Person() {//конструктор
        System.out.println(name + age);
    }

    //методы по работе с Person
    void print() {
        System.out.println(name + age);
    }
}
