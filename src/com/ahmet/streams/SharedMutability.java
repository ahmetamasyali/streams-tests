package com.ahmet.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class SharedMutability
{
    public static void main(String[] args)
    {
        Stream<Integer> numbers = Stream.iterate(2, n -> n + 1);

        // ilk 1000 asal sayıyı bir set'e aktar

        Set<Integer> primeNumbersSet = numbers.parallel()
                .filter(SharedMutability::isPrime)
                .limit(1000)
                .reduce(new HashSet<>(), (set,b) -> {
                    set = new HashSet<>(set);
                    set.add(b);
                    return set;
                }, (set1,set2) -> {
                    set1.addAll(set2);
                    return set1;
                });

        System.out.println("Count : " + primeNumbersSet.size());

        System.out.println(primeNumbersSet.stream()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));

    }


    public static boolean isPrime(int divider)
    {
        IntStream numbers = IntStream.range(2, divider -1);

        return numbers.noneMatch(n -> divider % n == 0);
    }










    /*
      List<Integer> ageList = personList.stream()
                .map(Person::getAge)
                .reduce(new ArrayList<>(),
                        (list, num) -> {
                           list.add(num);
                           return list;
                        },
                        (list1,list2) -> {
                                list1.addAll(list2);
                                return list1;
                        });


        System.out.println(ageList);
     */

}
