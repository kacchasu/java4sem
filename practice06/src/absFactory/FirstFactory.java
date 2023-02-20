package absFactory;

public class FirstFactory implements Factory {
    public FirstFactory() {
        System.out.println("creating first factory");
    }

    @Override
    public Product createProduct() {
        System.out.println("creating concrete product");
        return new ConcreteProduct();
    }
}
