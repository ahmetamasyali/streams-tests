package com.ahmet;

public class Person
{
    public String name;

    public Person(String name)
    {
        this.name = name;
    }

    public static int compare(Person person1, Person person2)
    {
        return person1.getName().compareTo(person2.getName());
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
