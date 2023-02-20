package absFactory;

public class Form {
    private final Product product;

    public Form(Factory factory) {
        System.out.println("creating form");
        this.product = factory.createProduct();
    }
}
