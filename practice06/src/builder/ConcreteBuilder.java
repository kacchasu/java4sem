package builder;

public class ConcreteBuilder implements ProductBuilder {
    private int a;
    private int b;
    private int c;
    private int d;

    public ConcreteBuilder() {
        super();
    }

    @Override
    public ProductBuilder doA() {
        System.out.println("do a");
        this.a = 1;
        return this;
    }

    @Override
    public ProductBuilder doB() {
        System.out.println("do b");
        this.b = 1;
        return this;
    }

    @Override
    public ProductBuilder doC() {
        System.out.println("do c");
        this.c = 1;
        return this;
    }

    @Override
    public ProductBuilder doD() {
        System.out.println("do d");
        this.d = 1;
        return this;
    }

    @Override
    public Product build() {
        return new Product(a, b, c, d);
    }
}
