package test;

import a1.Address;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress(new Address("123", "23434"));
        System.out.println(person);
    }
}
