package com.ahmet.collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.ahmet.Person;

public class MaxByMinByExample
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


        Person oldestPerson = personList.stream()
                .reduce((a,b) -> a.getAge() > b.getAge() ? a : b).get();

        System.out.println(oldestPerson);


      String oldestPersonsName = personList.stream()
                .collect(collectingAndThen(
                        maxBy(Comparator.comparing(Person::getAge)),
                        p -> p.map(Person::getName).orElse("")));

        System.out.println(oldestPerson);
    }

}
