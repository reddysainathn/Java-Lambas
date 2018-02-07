import java.util.*;
import java.util.function.Predicate;

public class Unit1ExerciseLambda {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Hello", "Cainath", 23),
                new Person("Iello", "Painath", 24),
                new Person("Oello", "Yainath", 25),
                new Person("Pello", "Cainath", 26),
                new Person("Uello", "Kainath", 29),
                new Person("Yello", "Lainath", 51)
        );
        //Sort List by lastName
        Collections.sort(people, (p, p1) -> p.getLastName().compareTo(p1.getLastName()));

        //Create method to print all elements in List
        printAll(people);

        // Print all elements with lastName Begins with c
        getWithCLambda(people, s -> s.getLastName().startsWith("C"));
    }

    public static List<String> getAllfirtNames(List<Person> people) {
        List<String> rep = new ArrayList<>();
        people.forEach(person -> rep.add(person.getLastName()));
        return rep;
    }

    public static void printAll(List<Person> people) {
        people.forEach(p -> System.out.println(p));
    }

    public static void getWithCLambda(List<Person> people, Predicate<Person> condition) {
        people.forEach(p -> {
            if (condition.test(p))
                System.out.println("Firstname1:" + p.getFirstName() + " LastName1:" + p.getLastName() + " Age1:" + p.getAge());
        });
    }

}

