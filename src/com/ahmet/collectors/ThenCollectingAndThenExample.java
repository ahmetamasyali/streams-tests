package com.ahmet.collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.summingLong;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ahmet.Person;

public class ThenCollectingAndThenExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Ömer", 39);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);



        // isme göre grupla sayıları al, 2 ile çarp

        //collectingAndThen (Collector, Lambda)
        //groupingBy (Lambda, Collector)
        //mapping (Lambda, Collector)
        //filtering (Lambda, Collector)

        Map<String, Long> countByNames = personList.stream()
                .collect(groupingBy(Person::getName, collectingAndThen(counting(), c -> c*2)));

        System.out.print(countByNames);



        Map<String, Long> countByNames2 = personList.stream()
                .collect(groupingBy(Person::getName, collectingAndThen(counting(), c -> c*2)));


    }

}
