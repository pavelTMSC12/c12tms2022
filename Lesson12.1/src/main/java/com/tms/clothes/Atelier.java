package com.tms.clothes;

import java.util.ArrayList;

public class Atelier {

    private final ArrayList<Clothes> clothes;

    public Atelier(ArrayList<Clothes> clothes) {
        this.clothes = clothes;
    }

    public void dress(PersonType personType) {
        for (Clothes clothes : clothes) {
            if (checkClothes(clothes, personType)) {
                switch (personType) {
                    case WOMAN -> ((IWomanClothes) clothes).dressWoman();
                    case MAN -> ((IManClothes) clothes).dressMan();
                }
            }
        }
    }

    private boolean checkClothes(Clothes clothes, PersonType personType) {
        for (Class<?> anInterface : clothes.getClass().getInterfaces()) {
            if (anInterface == personType.getIClass()) {
                return true;
            }
        }
//        for (PersonType value : PersonType.values()) {
//            if (personType == value) {
//                return personType.getIClass().isAssignableFrom(clothes.getClass());
//            }
//        }
        return false;
//        return switch (personType) {
//            case MAN -> IManClothes.class.isAssignableFrom(clothes.getClass());
//            case WOMAN -> IWomanClothes.class.isAssignableFrom(clothes.getClass());
//        };
    }
}
