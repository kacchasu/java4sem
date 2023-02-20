public class FourthSingleton {
    private static FourthSingleton instance;

    private FourthSingleton(){}

    public static synchronized FourthSingleton getInstance() {
        if (instance == null)
            instance = new FourthSingleton();
        return instance;
    }
}
