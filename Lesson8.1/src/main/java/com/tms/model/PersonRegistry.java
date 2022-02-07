package com.tms.model;

import lombok.Getter;
import lombok.Setter;

import static com.tms.utils.Constants.*;

@Getter
@Setter
public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getRecruits() {
        Person[] result = new Person[persons.length];
//        ArrayList<Person> result = new ArrayList<>();
//        for (Person person : persons) {
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (checkRecruits(person)) {
                result[i] = person;
            }
        }
        return result;
    }

    private boolean checkRecruits(Person person) {
        return person.getAge() >= MIN_AGE && person.getAge() < MAX_AGE
                && person.getSex().equals(MALE);
    }
}
