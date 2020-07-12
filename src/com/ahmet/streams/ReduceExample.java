package com.ahmet.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.ahmet.Person;

public class ReduceExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Utku", 20);
        Person person2 = new Person("Doruk",10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 38);
        Person person5 = new Person("Ahmet", 35);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5);


        //En yaşlı kişinin ismini yaz

        Person oldestPerson = null;
        Integer maxAge = Integer.MIN_VALUE;
        for(Person person :personList)
        {
            if(person.getAge() > maxAge)
            {
                maxAge = person.getAge();
                oldestPerson = person;
            }
        }
        System.out.println(oldestPerson.getName());




        //Reduce List<T> -> R


//        reduce("", String::concat)
//        reduce(true, (a,b) -> a&&b)
//        reduce(false, (a,b) -> a||b)
//        reduce(Collections.emptySet(),
//                (a,b)->{ Set<X> s=new HashSet<>(a); s.addAll(b); return s; })
//        reduce(Double.POSITIVE_INFINITY, Math::min)
//        reduce(Double.NEGATIVE_INFINITY, Math::max)

        //collect
    }


    /*
     oldestPerson = personList.stream()
                .reduce((a,b) -> a.getAge() > b.getAge() ? a : b).get();

        System.out.println(oldestPerson.getName());
     */





    /*
      int sumOfAges = personList.stream()
                .map(Person::getAge)
                .reduce(0, (total, num) -> total += num);

        System.out.println(sumOfAges);


     */
}



