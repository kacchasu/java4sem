import java.time.LocalDate;
import java.util.stream.Stream;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human(20, "John", "Doe", LocalDate.of(2003, 1, 1), 85);
        Human human2 = new Human(18, "Abe", "Der", LocalDate.of(2005, 1, 1), 53);
        Human human3 = new Human(19, "Gor", "Bfe", LocalDate.of(2004, 1, 1), 15);
        Human human4 = new Human(20, "Csr", "Xaf", LocalDate.of(2003, 1, 1), 58);
        Human human5 = new Human(21, "Ofd", "Bur", LocalDate.of(2002, 1, 1), 90);
        Stream<Human> humanStream = Stream.of(human1, human2, human3, human4, human5);
        humanStream.filter(human -> human.weight > human.age)
                .forEach(System.out::println);
        System.out.println();

        humanStream = Stream.of(human1, human2, human3, human4, human5);
        humanStream.sorted((humanA, humanB) -> humanB.lastName.compareTo(humanA.lastName))
                .forEach(System.out::println);
        System.out.println();

        humanStream = Stream.of(human1, human2, human3, human4, human5);
        System.out.println((humanStream.reduce((accumulator, human) ->
                        new Human(0, "", "", LocalDate.of(1,1,1), accumulator.weight+human.weight))
                .get().weight));
    }
}
