package com.ahmet;

import java.util.Arrays;
import java.util.List;

public class FilterSortExample
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Burak", 20);
        Person person2 = new Person("Mehmet",10);
        Person person3 = new Person("Ahmet", 15);

        List<Person> userList = Arrays.asList(person1, person2, person3);


        userList.stream()
                .filter(person -> person.getAge() > 10)
                .forEach(System.out::println);
    }

}
