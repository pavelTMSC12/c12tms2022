package by.teachmeskills.person.shoes;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public abstract class Shoes {
    private final BigDecimal price;
    private boolean isOn;
    private String name;

    public Shoes(BigDecimal price, String name) {
        this.price = price;
        this.name = name;
    }


}
