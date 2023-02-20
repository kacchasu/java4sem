package prototype;

public class ComplicatedObject implements Copyable {
    private Type type;

    public enum Type {
        ONE, TWO
    }

    public ComplicatedObject copy() {
        return new ComplicatedObject();
    }

    public void setType(Type type) {
        this.type = type;
    }
}
