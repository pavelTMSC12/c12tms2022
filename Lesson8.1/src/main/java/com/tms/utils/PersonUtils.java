package com.tms.utils;


import com.tms.model.Address;
import com.tms.model.Person;

import static com.tms.utils.Constants.FEMALE;
import static com.tms.utils.Constants.MALE;

public class PersonUtils {
    public static Person[] createPersons() {
        Person[] people = new Person[5];
        {
            Person person = new Person("Konstantin2", 23, MALE, new Address("minsk"));
            people[0] = person;
        }
        {
            Person person = new Person("Александр", 25, MALE, new Address("mogilev"));
            people[1] = person;
        }
        {
            Person person = new Person("Vika", 22, FEMALE, new Address("Литва", "Каунас"));
            people[2] = person;
        }
        {
            Person person = new Person("Вадим", 18, MALE, new Address("vitebsk"));
            people[3] = person;
        }
        {
            Person person = new Person("Дима", 19, MALE, new Address("grodno"));
            people[4] = person;
        }
        return people;
    }
}
