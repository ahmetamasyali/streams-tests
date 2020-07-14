package com.ahmet.collectors;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import com.ahmet.Person;

public class CollectExamples
{
    public static void main(String[] args)
    {
        //group persons ages by name

        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Ömer", 39);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);

        personList.stream()
                .map(Person::getName)
                .collect(toUnmodifiableList());

        //toSet

        //toUnmodifyableList



        System.out.println(personList.stream()
                .map(Person::getName)
                .collect(joining(",")));

        personList.stream()
                .map(Person::getName)
                .collect(counting());
        //count
    }

}
