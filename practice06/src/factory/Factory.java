package factory;

public abstract class Factory {
    public Product factoryMethod(String type) {
        Product product = createProduct(type);

        product.makeProduct();

        System.out.println("product is ready");
        return product;
    }

    protected abstract Product createProduct(String type);
}
