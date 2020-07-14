package com.ahmet.lambda;

public class LambdaInterfaceExample
{

    public static double sum(double a, double b , Calculator calculate)
    {
        return calculate.calculate(a, b);
    }

    @FunctionalInterface
    public interface Calculator
    {
        double calculate(double a, double b);
    }

    public static void main(String[] args)
    {
        double result1 = sum(5.1, 3.7, (a,b) -> a + b );

        System.out.println(result1);


        ////dont!
//        sum(5.1, 3.7, (a, b) -> {
//            return a + b;
//         });

    }







}


