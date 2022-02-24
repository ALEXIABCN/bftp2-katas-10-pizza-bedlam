import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
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
    }
}
