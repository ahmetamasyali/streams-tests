package com.ahmet.streams;

import java.util.Arrays;
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



        //Predicate.not


        personList.stream()
                .filter(((Predicate<Person>) p -> p.getAge() > 10)
                        .or(p -> p.getName().startsWith("N"))
                        .and(p -> p.getName().startsWith("U"))
                        .negate())
                .forEach(System.out::println);
    }
}
