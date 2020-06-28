package com.ahmet;

import java.util.stream.Stream;

public class InfiniteStreams
{
    public static void main(String[] args)
    {

        Stream<Integer> infiniteStream = Stream.iterate(1 , n -> n+1);

        infiniteStream
                .skip(10)
                .limit(100)
                .forEach(System.out::println);

        /* Integer num = infiniteStream
                .filter(n -> n > 1000)
                .filter(n -> n % 13 == 0)
                .filter(n -> n % 17 == 0)
                .findFirst()
                .get();

        System.out.println("Number is : " + num);*/
    }

}
