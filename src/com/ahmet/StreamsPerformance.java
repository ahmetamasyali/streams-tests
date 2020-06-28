package com.ahmet;

import java.util.List;

public class StreamsPerformance
{
    public static void main(String[] args)
    {

        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        for(Integer integer : numberList)
        {
            System.out.println("checking number: " + integer);
            if(integer % 2 == 0 && integer > 9)
            {
                System.out.println(integer);
                break;
            }
        }

        //lazy
        numberList.stream()
                .filter(StreamsPerformance::isEven)
                .filter(StreamsPerformance::isBiggerThenNine)
                .limit(1)
                .forEach(System.out::println);
    }


    public static boolean isEven(int num)
    {
        //System.out.println("checking number is even: " + num);
        return num % 2 == 0;
    }

    public static boolean isBiggerThenNine(int num)
    {
        System.out.println("checking number is bigger then nine: " + num);
        return num > 9;
    }

}
