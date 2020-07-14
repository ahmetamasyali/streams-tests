package com.ahmet.streams;

import java.util.stream.Stream;

public class TakeWhileDropWhile
{
    public static void main(String[] args)
    {

        Stream<Integer> infiniteStream = Stream.iterate(1 , n -> n+1).limit(10);

        //  6 7

        infiniteStream.dropWhile(num -> num < 6)
                .takeWhile(num -> num < 8)
                .forEach(System.out::println);

    }

}
