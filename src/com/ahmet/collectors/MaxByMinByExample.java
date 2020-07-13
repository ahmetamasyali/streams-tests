package com.ahmet.collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.maxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.ahmet.Person;

public class MaxByMinByExample
{
    public static void main(String[] args)
    {
        //find oldest persons name

        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Ömer", 39);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);


        String oldestPerson = personList.stream()
                .reduce((a,b) -> a.getAge() > b.getAge() ? a : b)
                .map(Person::getName)
                .get();

        System.out.println(oldestPerson);


      String oldestPersonsName = personList.stream()
              .collect(maxBy(Comparator.comparing(a -> a.getAge())))
              .map(Person::getName)
              .orElse("");

        System.out.println(oldestPersonsName);
    }

}
