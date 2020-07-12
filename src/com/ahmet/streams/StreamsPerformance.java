package com.ahmet.streams;

import java.util.List;

import com.ahmet.Person;

public class StreamsPerformance
{
    public static void main(String[] args)
    {

        Person person1 = new Person("Utku", 21);
        Person person2 = new Person("Doruk",10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 38);
        Person person5 = new Person("Ahmet", 5);


        List<Person> personList = List.of(person1, person2, person3, person4, person5);

        //Lazy Evaluation

        //short circuiting
        // if ( isEven && isBiggerThenNine)

        // Lazy Parallel ?

        System.out.println(personList.stream()
                .map(StreamsPerformance::getAgeOfPerson)
                .filter(StreamsPerformance::isEven)
                .filter(StreamsPerformance::isBiggerThenNine)
                .findFirst().orElse(0));

    }
    public static Integer getAgeOfPerson(Person person)
    {
        //System.out.println("getting age of of person: " + person.getName());
        return person.getAge();
    }

    public static boolean isEven(int num)
    {
        System.out.println("checking number is even: " + num);
        return num % 2 == 0;
    }

    public static boolean isBiggerThenNine(int num)
    {
        //System.out.println("checking number is bigger then nine: " + num);
        return num > 9;
    }

}
