package com.ahmet.collectors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

import com.ahmet.Person;

public class GroupingByExample
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



        //groupingBy (Lambda, Collector)

        //mapping (Lambda, Collector)

        //filtering (Lambda, Collector)

        Map<String, Set<Integer>> nameMapStream = personList.stream()
                .collect(groupingBy(Person::getName,
                        mapping(Person::getAge,
                                filtering( a -> a<60, toSet()))));

        nameMapStream.forEach((name, ageSet) -> System.out.println("name :"+ name + ": " + ageSet));
    }

}
