package com.ahmet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Burak", 11);
        Person person2 = new Person("Mehmet", 25);
        Person person3 = new Person("Ahmet", 67);

        List<Person> userList = Arrays.asList(person1, person2, person3);

        Map<String,Integer> ages = new HashMap<String, Integer>();

        ages.put("ahmet",27);
        ages.put("mehmet",30);
        ages.put("ali",12);

        ages.forEach((name,age) -> System.out.println("Name: "+name + " Age: " + age));

        userList.forEach(System.out::println);
    }

}
