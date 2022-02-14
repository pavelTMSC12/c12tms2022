import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class AirTransport extends Transport {//воздушный
    private double wingspan;//размах крыльев(м)
    private double minRunwayLength;//Минимальная длина взлётно-посадочной полосы для взлёта
}