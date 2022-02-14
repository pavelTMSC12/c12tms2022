package flowers;

import java.util.Locale;

import static flowers.Constants.*;

/**
 * Человек приходит в магазин со списком сколько букетов ему надо и каких цветов.
 */
public class Main {
    public static void main(String[] args) {
        FlowerMarket flowerMarket = new FlowerMarket();
        Bouquet[] bouquets = {
                flowerMarket.getBouquet(ROSE, ROSE, ROSE, "кактус"),
                flowerMarket.getBouquet(LILY, ROSE, ROSE, LILY, LILY),
                flowerMarket.getBouquet(GERBERA, ROSE, ROSE, ASTER)
        };
        for (Bouquet bouquet : bouquets) {
            printInfo(bouquet);
        }
        System.out.printf("Количество проданных цветов %d", flowerMarket.getCountSoldFlowers());
    }

    private static void printInfo(Bouquet bouquet) {
        System.out.println(bouquet);
        System.out.printf(Locale.ROOT, "Стоимость букета: %.2f рублей\n\n", bouquet.getPrice());
    }
}
