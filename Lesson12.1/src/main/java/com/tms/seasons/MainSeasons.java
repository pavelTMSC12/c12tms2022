package com.tms.seasons;

import java.util.ArrayList;
import java.util.List;

public class MainSeasons {
    public static void main(String[] args) {
        List<Seasons> seasons = new ArrayList<>();
        seasons.add(Seasons.SUMMER);
        seasons.add(Seasons.AUTUMN);
        seasons.add(Seasons.WINTER);
        seasons.add(Seasons.SPRING);
        for (Seasons season : seasons) {
            System.out.println(season.getDescription());
            System.out.println("Средняя температура воздуха = " + season.getTemperature());
            System.out.println(season.getInfo());
        }
    }
}
