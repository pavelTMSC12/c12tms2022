package by.teachmeskills.person;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Clothes {
    private BigDecimal price;
    private final Brand brand;
    private final Type type;

    public Clothes(BigDecimal price, Brand brand, Type type) {
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    public enum Type {
        JACKET("Куртка"),
        PANTS("Штаны"),
        SHOES("Обувь");

        public final String name;

        Type(String name) {
            this.name = name;
        }
    }

    public enum Brand {
        ADIDAS("адидас"),
        PUMA("пума"),
        ZARA("зара");

        public final String name;

        Brand(String name) {
            this.name = name;
        }
    }
}

