package com.ahmet.streams;

import java.util.List;

import com.ahmet.Person;
import com.ahmet.Timer;

public class StreamsPerformance3
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Utku", 21);
        Person person2 = new Person("Doruk",10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 38);
        Person person5 = new Person("Ahmet", 5);


        List<Person> personList = List.of(person1, person2, person3, person4, person5);

        //parallel
        Timer.withTime( () ->  personList.parallelStream()
                .map(StreamsPerformance3::heavyFunction)
                .forEach(System.out::println));


    }


    public static Person heavyFunction(Person person)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return person;
    }

}
