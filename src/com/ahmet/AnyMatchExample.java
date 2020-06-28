package com.ahmet;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample
{
    public static void main(String[] args)
    {

        //is a 15 year old person exist with name Burak

        Person person1 = new Person("Burak", 20);
        Person person2 = new Person("Mehmet",10);
        Person person3 = new Person("Burak", 15);

        List<Person> userList = Arrays.asList(person1, person2, person3);

        boolean nameFound  = false;
        for(Person person : userList)
        {
            if("Burak".equals(person.getName()) && person.getAge() == 15)
            {
                nameFound = true;
                break;
            }
        }

        System.out.println("nameFound: " + nameFound);

       /* boolean nameFoundLambda =  userList.stream()
                .filter(u -> u.getAge() == 15)
                .anyMatch(u -> u.getName().equals("Burak"));*/

    }

}
