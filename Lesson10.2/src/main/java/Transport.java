import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Transport {//базовый класс
    private double power; // Мощность(в лошадиных силах)
    private double maxSpeed; //Максимальная скорость(км/ч)
    private double weight; //Масса (кг)
    private String brand; //марка

    private double getPower(double power) {
        return power * 0.74;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + getPower(power) +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}