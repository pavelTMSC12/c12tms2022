package flowers;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static flowers.Constants.flowerNamePriceArray;

/**
 * Магазин по продаже букетов из цветов.
 */
@Getter
public class FlowerMarket {
    //    private int countSoldFlowers;//количество проданных цветов
    private final List<Bouquet> soldBouquets = new ArrayList<>();//проданные букеты

    //магазин умеет собирать(получать) букет из цветов
    public Bouquet getBouquet(String... flowers) {
        Flower[] result = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            String flowerName = flowers[i];
            BigDecimal price = findPriceByFlowerName(flowerName);
            if (price != null) {
                result[i] = new Flower(flowerName, price);
//                countSoldFlowers++;
            }
        }
        Bouquet bouquet = new Bouquet(result);
        soldBouquets.add(bouquet);
        return bouquet;
    }

    private BigDecimal findPriceByFlowerName(String name) {
        for (int i = 0; i < flowerNamePriceArray.length; i++) {
            String flowerName = flowerNamePriceArray[i][0];
            if (name.equalsIgnoreCase(flowerName)) {
                return new BigDecimal(flowerNamePriceArray[i][1]);
            }
        }
        return null;
    }

    //магазин умеет отдавать информацию о количестве проданных цветов
    //также можно узнать сколько продали букетов(как это сделать?)
    public int getCountSoldFlowers() {
        int count = 0;
        for (Bouquet soldBouquet : soldBouquets) {
            for (Flower flower : soldBouquet.getFlowers()) {
                if (flower != null) {
                    count++;
                }
            }
        }
        return count;
    }
}
