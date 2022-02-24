import org.junit.jupiter.api.Test;

<<<<<<< HEAD
=======
import java.math.BigDecimal;

>>>>>>> 0fbb694b48dd2a1c81f5881365d5614943137660
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
<<<<<<< HEAD
    void pizzaMargherita() {
        MargheritaPizza MargheritaPizza = new MargheritaPizza();

        String price = MargheritaPizza.getPrice();

        assertThat(price, equalTo("MARGHERITA   9,30€\n"))

    }
    //HACER LOS TEST DE LAS 4 PIZZAS PRIMERO

    @Test
    void pizzaMargherita() {
        MargheritaPizza MargheritaPizza = new MargheritaPizza();

        String ticket = MargheritaPizza.getTicket();

        assertThat(ticket, equalTo("MARGHERITA   9,30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9,30€"));
=======
    void pizzaMargarita() {
        Pizza margaritaPizza = new Pizza("margherita", BigDecimal.valueOf(9.30));

        String ticket = margaritaPizza.getTicket();

        assertThat(ticket, equalTo("MARGHERITA   9.30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9.30€"));
    }

    // YAGNI

    @Test
    void prosciutto() {
        Pizza prosciuttoPizza = new Pizza("prosciutto", BigDecimal.valueOf(12.00));

        String ticket = prosciuttoPizza.getTicket();

        assertThat(ticket, equalTo("PROSCIUTTO   12.00€\n" +
                "   _____________________________\n" +
                "   TOTAL                 12.00€"));
>>>>>>> 0fbb694b48dd2a1c81f5881365d5614943137660
    }
}
