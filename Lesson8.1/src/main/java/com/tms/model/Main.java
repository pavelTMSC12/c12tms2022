package com.tms.model;

import static com.tms.utils.PersonUtils.createPersons;

public class Main {
    public static void main(String[] args) {
        Person[] persons = createPersons();
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);

        Person[] recruitsNames = militaryOffice.getRecruits();
        for (int i = 0; i < recruitsNames.length; i++) {
            Person person = recruitsNames[i];
            if (person != null) {
                System.out.println(person);
            } else {
                break;
            }
        }
        System.out.println(recruitsNames);

        System.out.println(militaryOffice.getRecruitsByAddress("Minsk"));
    }
}
