package com.ahmet.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ahmet.Timer;

public class StreamsPerformance
{
    public static void main(String[] args)
    {

        List<Integer> numberList = IntStream.range(0 , 10000000)
                .boxed().collect(Collectors.toCollection(ArrayList::new));

        Timer.withTime(() -> {
            long sum=0;
            for(Integer num : numberList)
            {
                //System.out.println("checking number: " + integer);
                if(isEven(num) && isBiggerThenNine(num))
                {
                    sum += 1;
                }
            }
            System.out.println(sum);
        });

        Timer.withTime(() -> {
            //lazy
            System.out.println(numberList.parallelStream()
                    .filter(StreamsPerformance::isEven)
                    .filter(StreamsPerformance::isBiggerThenNine)
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
        //System.out.println("checking number is bigger then nine: " + num);
        return num > 9;
    }

}
