<<<<<<< HEAD
public class Pizza {

=======
import java.math.BigDecimal;
import java.util.Locale;

public record Pizza(String name, BigDecimal price) {


    public String getTicket() {
        // Java string interpolation
        return String.format("%s   %.2f€\n   _____________________________\n   TOTAL                 %.2f€",
                name.toUpperCase(Locale.ROOT), price, price);
    }
>>>>>>> 0fbb694b48dd2a1c81f5881365d5614943137660
}
