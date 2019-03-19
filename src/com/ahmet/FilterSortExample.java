package com.ahmet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSortExample
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Burak");
        Person person2 = new Person("Mehmet");
        Person person3 = new Person("Ahmet");

        List<Person> userList = Arrays.asList(person1, person2, person3);

        Collections.sort(userList, Person::compare);

        System.out.println("Sorted:");
        userList.stream().forEach(System.out::println);

        System.out.println("\nSorted with parallel stream:");
        userList.parallelStream().forEach(System.out::println);

        System.out.println("\nFiltered:");
        userList.stream().filter(person -> person.getName().length() == 5).forEach(System.out::println);
    }

}
