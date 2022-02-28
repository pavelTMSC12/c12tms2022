package by.teachmeskills.person;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
public class ClothesShopServiceImpl implements ClothesShopService {
    private final List<IPerson> personList;

    @Override
    public void putOn() {
        for (IPerson person : personList) {
            person.putOn();
        }
    }

    @Override
    public void takeOff() {
        for (IPerson person : personList) {
            person.takeOff();
        }
    }

    @Override
    public BigDecimal getClothesWithMaxPrice() {
        //реализация поиска максимальной цены у человека
        return null;
    }
}
