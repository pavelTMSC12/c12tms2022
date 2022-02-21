package robot;

import abs.IPrice;
import hands.IHand;
import heads.IHead;
import legs.ILeg;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = ((IPrice) head).getPrice() + hand.getPrice() + leg.getPrice();
//        int price = ((RobotParts) head).getPrice();
        return price;
    }


}
