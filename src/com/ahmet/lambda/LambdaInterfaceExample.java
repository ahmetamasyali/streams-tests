package com.ahmet.lambda;

public class LambdaInterfaceExample
{
    public static void main(String[] args)
    {
        double result1 = sum(5.1, 3.7, (a, b) -> a + b);
        System.out.println(result1);

    }

    public static double sum(double a, double b , Calculate calculate)
    {
        return calculate.calculate(a, b);
    }


    @FunctionalInterface
    public interface Calculate
    {
        double calculate(double a, double b);
    }


}


