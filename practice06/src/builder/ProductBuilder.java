package builder;

public interface ProductBuilder {

    ProductBuilder doA();

    ProductBuilder doB();

    ProductBuilder doC();

    ProductBuilder doD();

    Product build();
}
