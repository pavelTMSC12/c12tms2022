package by.teachmeskills.person.jacket;

import by.teachmeskills.person.Clothes;

import java.math.BigDecimal;

import static by.teachmeskills.person.Clothes.Type.JACKET;


public class Jacket extends Clothes {

    public Jacket(BigDecimal price, Brand brand) {
        super(price, brand, JACKET);
    }
}
