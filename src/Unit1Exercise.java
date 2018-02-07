import java.util.*;

public class Unit1Exercise {

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
        Comparator<String> comparing = (String a, String b) -> {
            return b.compareTo(a);
        };
        Collections.sort(getAllfirtNames(people), comparing);

        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Create method to print all elements in List
        printAll(people);
        // Print all elements with lastName Begins with c
        getWithC(people);
        getWithCLambda(people, new Condition() {
            @Override
            public boolean test(Person s) {
                return s.getLastName().startsWith("C");
            }
        });
    }

    public static List<String> getAllfirtNames(List<Person> people) {
        List<String> rep = new ArrayList<>();
        people.forEach(
                person -> rep.add(person.getLastName())
        );
        return rep;
    }

    public static void printAll(List<Person> people) {
        for (Person p : people) {
            System.out.println("Firstname:" + p.getFirstName() + " LastName:" + p.getLastName() + " Age:" + p.getAge());
        }
        // System.out.println(people.toString());
    }

    public static void getWithC(List<Person> people) {
        System.out.println("Printing With LastName C");
        for (Person p : people) {
            if (p.getLastName().startsWith("C")) {
                System.out.println("Firstname:" + p.getFirstName() + " LastName:" + p.getLastName() + " Age:" + p.getAge());
            }
        }
        // System.out.println(people.toString());
    }

    public static void getWithCLambda(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println("Firstname:" + p.getFirstName() + " LastName:" + p.getLastName() + " Age:" + p.getAge());
            }
        }
    }

}

interface Condition {
    boolean test(Person s);
}