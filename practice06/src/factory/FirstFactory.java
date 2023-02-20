package factory;

public class FirstFactory extends Factory {
    @Override
    public Product createProduct(String type) {
        Product product = new ConcreteProduct();
        return product;
    }
}
