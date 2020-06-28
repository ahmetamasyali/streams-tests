package com.ahmet;

public class Person
{
    private String name;
    private Integer age;

    public Person(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public static boolean isAgeEvenStatic(Person person1)
    {
        return person1.getAge() % 2 == 0;
    }

    public boolean isAgeEven()
    {
        return this.getAge() % 2 == 0;
    }

    public static int compareStatic(Person person1, Person person2)
    {
        return person1.getName().compareTo(person2.getName()) * person1.getAge().compareTo(person2.getAge());
    }

    public int compare(Person person2)
    {
        return this.name.compareTo(person2.getName()) * this.age.compareTo(person2.getAge());
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
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
        return this.name + " " + this.age;
    }
}
