package builder;

public class Director {
    private ProductBuilder builder;

    public Director(ProductBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("cant work without product builder");
        }
    }

    public Product makeProduct() {
        return builder.doA().doB().doC().doD().build();
    }
}
