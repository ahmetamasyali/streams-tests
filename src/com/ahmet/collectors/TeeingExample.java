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
        //group persons ages by name

        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);
        Person person4 = new Person("Eren", 25);
        Person person5 = new Person("Ömer", 39);

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



        Result result = personList.stream()
                .collect(teeing(
                        filtering(p -> p.getName().equals("Eren"), mapping(Person::getAge, summingLong(Integer::longValue))),
                        filtering(p -> p.getName().equals("Eren"), mapping(Person::getAge, counting())),
                        Result::new
                ));

        System.out.println(result);
    }



}

class Result
{
    long sum;
    long count;

    public Result(long sum, Long count)
    {
        this.sum = sum;
        this.count = count;
    }

    @Override
    public String toString()
    {
        return sum + " " + count;
    }
}