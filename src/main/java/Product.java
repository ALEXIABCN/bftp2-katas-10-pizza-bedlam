import java.math.BigDecimal;

public class Product {

    private String nameExtra;
    private String nameIngredient;
    private BigDecimal pricePizza;
    private BigDecimal priceExtra;
    private String namePizza;
    private BigDecimal priceIngredient;

    public Product(String nameExtra, String nameIngredient, BigDecimal pricePizza, BigDecimal priceExtra, String namePizza, BigDecimal priceIngrediente) {
        this.nameExtra= nameExtra;
        this.nameIngredient = nameIngredient;
        this.ipricePizza= pricePizza;
        this.color = color;
        this.basePrice = basePrice;
        this.name = name;
        this.sellPrice = sellPrice;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isStinky() {
        return isStinky;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }
}
