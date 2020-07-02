package com.ahmet.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ahmet.Person;

public class ForEachExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Özgür", 11);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);

        List<Person> userList = Arrays.asList(person1, person2, person3);

        userList.forEach(System.out::println);
    }

}
