package com.tms.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class MilitaryOffice {
    private PersonRegistry personRegistry;//характеристика

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

//    public List<String> getRecruitsNames() {
//        List<String> result = new ArrayList<>();
//        Person[] persons = personRegistry.getPersons();
//        for (Person person : persons) {
//            if (checkRecruits(person)) {
//                result.add(person.getName());
//            }
//        }
//        return result;
//    }

    public Person[] getRecruits() {
//        List<Person> recruits = personRegistry.getRecruits();
//        List<String> result = new ArrayList<>();
//        for (Person recruit : recruits) {
//            result.add(recruit.getName());
//        }
        return personRegistry.getRecruits();
    }

    public int getCountRecruits() {
        return personRegistry.getRecruits().length;
    }

    public List<Person> getRecruitsByAddress(String city) {
        Person[] recruits = personRegistry.getRecruits();
        ArrayList<Person> result = new ArrayList<>();
        for (Person recruit : recruits) {
            if (recruit != null && recruit.getAddress().getCity().equalsIgnoreCase("Минск")) {
                System.out.println(recruit);
//                result.add(recruit);
            }
        }
        return result;
    }
}
