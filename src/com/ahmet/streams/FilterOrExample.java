package com.ahmet.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.ahmet.Person;

public class FilterOrExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Utku", 21);
        Person person2 = new Person("Doruk", 10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 24);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4);


        Predicate<Person> predicate = Person::isAgeEven;

        predicate = predicate.or(p -> p.getName().startsWith("U"));

        personList.stream()
                .filter(predicate)
                .forEach(System.out::println);

        //Predicate.not
    }
}
