package com.ahmet.streams;

import java.util.Collection;
import java.util.List;

import com.ahmet.Person;

public class MapFlatMapExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Eren", 11);
        Person person2 = new Person("Özgür", 25);
        Person person3 = new Person("Utku", 67);

        Person person4 = new Person("Ömer", 21);
        Person person5 = new Person("Tolga", 45);
        Person person6 = new Person("Arda", 37);

        List<Person> kurumsal = List.of(person1, person2, person3 );
        List<Person> finans = List.of(person4, person5, person6 );

        List<List<Person>> kureList = List.of(kurumsal, finans);

        //map flatten

        kureList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


        /*kureList.stream()
                .flatMap(Collection::stream)
                .map(p -> p.getName())
                .forEach(System.out::println);*/




        //flatMap  Stream<List<T>> -> Stream<T>
    }

}
