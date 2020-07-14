package com.ahmet.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.ahmet.Person;

public class FilterMapSortExample
{
    public static void main(String[] args)
    {

        //  Java 8'de tanıtılan Stream API, nesne koleksiyonlarını işlemek için kullanılır.

        //  Bir stream ile istenen sonucu üretmek bir pipeline oluşturup buna fonksiyonlar ekleriz

        //  Streamler orijinal veri yapısını değiştirmez,yalnızca pipeline methodlarına göre üretilen sonuç değişir

        //external iterasyon
        //internal iterasyon


        //Avantajları
        //1- Döngülerle lojiği anlamak zordur, streamler daha anlaşılırdır
        //2- Kısa ve özdür
        //3- Lambda ve methed referansı ile birlikte doğal bir şekilde kullanılabilir
        //4- Paralel Streamler

        //DezAvantajları
        // 1- Performans - CPU ve Memory
        // 2- Alışık değilseniz okuması zor olabilir
        // 3- Debug etmesi zor

        Person person1 = new Person("Utku", 20);
        Person person2 = new Person("Doruk",10);
        Person person3 = new Person("Özgür", 15);
        Person person4 = new Person("Eren", 24);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4);


        //filter  Stream<T> -> Stream<T>
        //map  Stream<T> -> Stream<T>
        //sort  Stream<T> -> Stream<T>

        //filter -> stream elemanlarından koşula uymayanları eler
        //map -> stream elemanları üzerinde dönüşüm yapar
        //sort -> stream elemanlarını sıralar

        //yaşı 15 ten büyük olanlar ve ismi E ile başlayanların yaşı

        for(Person person : personList)
        {
            if(person.getAge() > 15 && person.getName().startsWith("E"))
            {
                System.out.println(person.getAge());
            }
        }



        //yaşa göre sırala


       /* personList.stream()
                .filter(person -> person.getAge() > 1)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(Person::getAge)
                .forEach(System.out::println);*/




        //intermediate functions -> map,sort,filter,flatmap
        //terminal functions  -> foreach,reduce,collect,sum,count

        //dont!
        personList.stream().filter(person -> person.getAge() > 1).sorted(Comparator.comparing(Person::getAge).reversed()).map(Person::getAge);

    }


}












    /*

        personList.stream()
                .filter(person -> person.getAge() > 10)
                .sorted()
                .map(p -> p.getName() + " " + p.getAge())

                .forEach(System.out::println);*/
