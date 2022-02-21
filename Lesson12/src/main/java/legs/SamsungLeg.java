package legs;

import abs.RobotParts;

public class SamsungLeg extends RobotParts implements ILeg {

    public SamsungLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг");
    }
}