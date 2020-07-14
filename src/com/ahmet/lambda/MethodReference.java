package com.ahmet.lambda;

import java.util.Arrays;
import java.util.List;

import com.ahmet.Person;

public class MethodReference
{
    public static void main(String[] args)
    {
        //print the name of even aged persons

        Person person1 = new Person("Özgür", 12);
        Person person2 = new Person("Doruk", 25);
        Person person3 = new Person("Utku", 67);

        List<Person> userList = Arrays.asList(person1, person2, person3);

        userList.forEach(Person::isAgeEvenStatic);

        userList.forEach(Person::isAgeEven);
    }
}



