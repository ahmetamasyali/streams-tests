package com.ahmet.collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toUnmodifiableList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.ahmet.Person;

public class GroupingByExample2
{
    public static void main(String[] args)
    {
        //group persons ages by name

        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Doruk", 39);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);

        Map<String, Set<Integer>> nameMap = new HashMap<>();
        for(Person person : personList)
        {
            if(!nameMap.containsKey(person.getName()))
            {
                nameMap.put(person.getName(), new HashSet<>());
            }

            nameMap.get(person.getName()).add(person.getAge());
        }


        System.out.println(personList.stream()
                .map(Person::getName)
                .collect(collectingAndThen(
                        groupingBy(String::valueOf, Collectors.counting()),
                            (Map<String, Long> a) -> {
                                a.values().removeIf( v -> v < 2);
                                return a.keySet();
                            }
                )));

    }



    private static Person changePersonNameToUpperCase(Person p)
    {
        return p;
    }

}
