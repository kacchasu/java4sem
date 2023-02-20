public class ThirdSingleton {
    private static ThirdSingleton instance;

    private ThirdSingleton(){}

    static {
        try {
            instance = new ThirdSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }
    public static ThirdSingleton getInstance(){
        return instance;
    }
}
