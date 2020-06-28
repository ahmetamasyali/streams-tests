package com.ahmet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupingByExample
{
    public static void main(String[] args)
    {
        //group persons ages by name

        Person person1 = new Person("Burak", 11);
        Person person2 = new Person("Mehmet", 25);
        Person person3 = new Person("Ahmet", 67);
        Person person4 = new Person("Burak", 25);
        Person person5 = new Person("Burak", 39);

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

        for(String key : nameMap.keySet())
        {
            System.out.println("name :"+ key + ": " + nameMap.get(key));
        }



        /*Map<String, Set<Integer>> nameMapStream = personList.stream()
                .collect(groupingBy(Person::getName,
                        mapping(Person::getAge, toSet())));

        nameMapStream.forEach((name, ageSet) -> System.out.println("name :"+ name + ": " + ageSet));*/
    }

}
