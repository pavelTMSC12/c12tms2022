package com.tms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static com.tms.utils.Constants.MALE;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
    private String name;
    private int age;
    private String sex = MALE;
    private Address address;
}
