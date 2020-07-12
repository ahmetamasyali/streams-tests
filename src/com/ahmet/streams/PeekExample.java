package com.ahmet.streams;

import java.util.Arrays;
import java.util.List;

import com.ahmet.Person;

public class PeekExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Utku", 20);
        Person person2 = new Person("Doruk", 10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 38);
        Person person5 = new Person("Ahmet", 35);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);


        personList.stream()
                .filter(Person::isAgeEven)
                .peek(p -> System.out.println("Hello Peek " + p))
                .map(Person::getAge)
                .filter(p -> p > 100)
                .forEach(System.out::println);

    }

}