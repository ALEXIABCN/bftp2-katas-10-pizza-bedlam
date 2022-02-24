import java.util.List;

    public class StoreApplication {
        private boolean quit;

        private final List<Product> catalog = List.of(
                new Product(0, "Call Of Duty Modern Warfare", 19.27, false),
                new Product(1,"Mario Kart 64", 12.30, true),
                new Product(2,"Rust", 0.0, false),
                new Product(3,"Medieval 2 Total War", 30.0, false),
                new Product(4, "Call Of Duty: Black Ops 2", 19.99, false)
        );

        private final Pizza pizza;

    }
