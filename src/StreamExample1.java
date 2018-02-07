import com.example.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Hello", "Cainath", 23),
                new Person("Iello", "Painath", 24),
                new Person("Oello", "Yainath", 25),
                new Person("Pello", "Cainath", 26),
                new Person("Uello", "Kainath", 29),
                new Person("Yello", "Lainath", 51)
        );
    //people.stream().parallel().forEach(System.out::println);
    people.stream().parallel().filter(
            person -> person.getLastName().startsWith("C")
    ).forEach(System.out::println);

        Stream<Person> personStream = people.parallelStream();
    }
}
