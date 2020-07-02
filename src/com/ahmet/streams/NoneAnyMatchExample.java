package com.ahmet.streams;

import java.util.Arrays;
import java.util.List;

import com.ahmet.Person;

public class NoneAnyMatchExample
{
    public static void main(String[] args)
    {
        Person person1 = new Person("Utku", 20);
        Person person2 = new Person("Doruk",10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 24);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4);


        boolean any20YearsOldUtkuExit = false;

        for(Person person : personList)
        {
            if(person.getAge() == 20 && "Utku".equals(person.getName()))
            {
                any20YearsOldUtkuExit = true;
                break;
            }
        }
        System.out.println(any20YearsOldUtkuExit);



        /*any20YearsOldUtkuExit = personList.stream()
                .filter(p ->p.getAge() == 20)
                .anyMatch(p -> "Utku".equals(p.getName()));

        System.out.println(any20YearsOldUtkuExit);*/

        //dont
         //any20YearsOldUtkuExit = personList.stream().filter(p ->p.getAge() == 20).anyMatch(p -> "Utku".equals(p.getName()));



        // AnyMatch List<T> -> boolean
    }

}
