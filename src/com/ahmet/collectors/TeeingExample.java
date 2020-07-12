package com.ahmet.collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.summingLong;
import static java.util.stream.Collectors.teeing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.ahmet.Person;

public class TeeingExample
{
    public static void main(String[] args)
    {
        // ismi eren olanların yaşlarını topla,
        // ismi Özgür olanların sayısını al
        //bir map'e at

        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Eren", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Ömer", 39);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);



        //teeing ( Collector, Collector, Lambda)
        //collectingAndThen (Collector, Lambda)
        //groupingBy (Lambda, Collector)
        //mapping (Lambda, Collector)
        //filtering (Lambda, Collector)

        Map<Long, Long> map = personList.stream()
                .collect(teeing(
                        filtering(p -> p.getName().equals("Eren"), summingLong(Person::getAge)),
                        filtering(p -> p.getName().equals("Özgür"), counting()),
                        Map::of
                ));

        System.out.println(map);
    }



}
