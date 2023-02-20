import java.util.function.Predicate;

public class Test {
    public static void testString(String s, Predicate<String> pin) {
        if (pin.test(s))
            System.out.println("is pin");
        else
            System.out.println("is not pin");
    }
    public static void main(String[] args) {
        String s1 = "423s";
        String s2 = "4234";
        String s3 = "152341";
        String s4 = "42342";
        testString(s1, s -> s.matches("\\d{4}|\\d{6}"));
        testString(s2, s -> s.matches("\\d{4}|\\d{6}"));
        testString(s3, s -> s.matches("\\d{4}|\\d{6}"));
        testString(s4, s -> s.matches("\\d{4}|\\d{6}"));
    }
}
