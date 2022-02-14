package flowers;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final String ROSE = "роза";
    public static final String LILY = "лилия";
    public static final String ASTER = "астра";
    public static final String GERBERA = "гербера";
    public static final String TULIP = "тюльпан";
    public static final String CARNATION = "гвоздика";

    public static final String[][] flowerNamePriceArray = {
            {ROSE, "15"},
            {LILY, "7"},
            {ASTER, "5"},
            {GERBERA, "5"},
            {TULIP, "8"},
            {CARNATION, "11"}
    };
}
