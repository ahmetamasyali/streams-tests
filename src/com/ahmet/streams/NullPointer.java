package com.ahmet.streams;


import com.ahmet.Person;

public class NullPointer
{
    public enum Season {
        SUMMER,WINTER,SPRING
    }
    public static void main(String[] args)
    {
        Person person = null;
        Person person2 = new Person(null, 11);

        System.out.println(person.getName().toLowerCase());
      //  System.out.println(person2.getName().toLowerCase());

        Season currentSeason = Season.SUMMER;


    }
}
