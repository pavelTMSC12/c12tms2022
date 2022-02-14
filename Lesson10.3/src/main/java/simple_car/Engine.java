package simple_car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Engine {
    private final String enginesType;
    private final double volume;
    private boolean isMotorOn;
    private double fuelSpend; // это для рассчета расхода топлива

    public Engine(String enginesType, double volume, double fuelSpend) {
        this.enginesType = enginesType;
        this.volume = volume;
        this.fuelSpend = fuelSpend;
    }

    public void engineOn() {
        isMotorOn = true;
        System.out.println("Двигатель включен");
    }
}



