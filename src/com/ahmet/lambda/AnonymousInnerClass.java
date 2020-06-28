package com.ahmet.lambda;

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Hello World");
            }
        };

        runnable.run();


        //Runnable runnableLambda = () -> System.out.println("Hello World With Lamda");
        //runnableLambda.run();

    }

}


