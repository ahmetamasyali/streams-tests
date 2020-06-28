package com.ahmet.lambda;

import java.util.Arrays;
import java.util.List;

import com.ahmet.Person;

public class MethodReference
{
    public static void main(String[] args)
    {
        //print the name of even aged persons

        Person person1 = new Person("Burak", 20);
        Person person2 = new Person("Mehmet", 10);
        Person person3 = new Person("Ahmet", 15);

        List<Person> userList = Arrays.asList(person1, person2, person3);

        for (Person person : userList)
        {
            if (person.getAge() % 2 == 0)
            {
                System.out.println(person.getName());
            }
        }




        /*userList.stream()
                .filter(p -> p.getAge() % 2 == 0)
                .forEach(p -> System.out.println(p.getName()));

        userList.stream()
                .filter(Person::isAgeEven)
                .forEach(System.out::println);

        userList.stream()
                .filter(Person::isAgeEvenStatic)
                .forEach(System.out::println);*/
    }

}
