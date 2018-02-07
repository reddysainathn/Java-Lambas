package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

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
        getWithCLambda(people, s -> s.getLastName().startsWith("C"), s -> System.out.println(s.getLastName()));
    }

    public static List<String> getAllfirtNames(List<Person> people) {
        List<String> rep = new ArrayList<>();
        people.forEach(person -> rep.add(person.getLastName()));
        return rep;
    }

    public static void printAll(List<Person> people) {
        people.forEach(System.out::println);
    }

    public static void getWithCLambda(List<Person> people, Predicate<Person> condition, Consumer<Person> personConsumer) {
        people.forEach(p -> {
            if (condition.test(p))
                personConsumer.accept(p);
        });
    }
}
