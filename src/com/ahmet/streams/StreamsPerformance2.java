package com.ahmet.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ahmet.Timer;

public class StreamsPerformance2
{
    public static void main(String[] args)
    {

        List<Integer> numberList = IntStream.range(0 , 10000000)
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        Timer.withTime(() -> {
            long count=0;
            for(Integer num : numberList)
            {
                //System.out.println("checking number: " + integer);
                if(isEven(num) && isBiggerThenNine(num))
                {
                    count += 1;
                }
            }
            System.out.println(count);
        });

        //Paralel Streams

        // More Cpu
        // More Memory
        //More Thread - Thread Pool


        Timer.withTime(() -> {
            System.out.println(numberList.stream()
                    .filter(StreamsPerformance2::isEven)
                    .filter(StreamsPerformance2::isBiggerThenNine)
                    .count());
            });


    }


    public static boolean isEven(int num)
    {
        //System.out.println("checking number is even: " + num);
        return num % 2 == 0;
    }

    public static boolean isBiggerThenNine(int num)
    {
        return num > 9;
    }

}
