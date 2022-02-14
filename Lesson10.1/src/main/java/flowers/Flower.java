package flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
/**
 * Статья про BigDecimal
 * {@link <a href="https://javarush.ru/groups/posts/2274-kak-ispoljhzovatjh-bigdecimal-v-java"/>}
 */
public class Flower {
    private String name;
    private BigDecimal price;
}


//class Test {
//    public static void main(String[] args) {
//        test();
//    }
//    static void test(){
//        System.out.println();
//        {
//            double a = 0.03;
//            double b = 0.02;
//            double c = a - b;
//            System.out.println(c);
//        }
//
//        {
//            BigDecimal a = new BigDecimal("0.03");
//            BigDecimal b = new BigDecimal("0.02");
//            BigDecimal c = a.subtract(b);
//            System.out.println(c);
//        }
//    }
//}