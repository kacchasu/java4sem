package builder;

public class Product {
    private int a;
    private int b;
    private int c;
    private int d;

    public Product() {
        super();
    }

    public Product(int a, int b, int c, int d) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }
}
