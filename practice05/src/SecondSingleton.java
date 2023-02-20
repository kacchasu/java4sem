public class SecondSingleton {
    private static final SecondSingleton instance = new SecondSingleton();

    private SecondSingleton(){}

    public static SecondSingleton getInstance() {
        return instance;
    }
}
