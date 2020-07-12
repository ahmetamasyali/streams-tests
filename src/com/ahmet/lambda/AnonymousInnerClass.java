package com.ahmet.lambda;

public class AnonymousInnerClass
{
    public static void main(String[] args)
    {
        //lambda - Java 8
        //functional programming'e ilk adım
        //herhangi bir class'a ait olmayan fonksiyon yaratmamıza imkan verir

        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Hello World");
            }
        };

        runnable.run();





        // (Parameters) -> { Body }
        // (Parameters) -> Implementation
    }

}













//Runnable runnableLambda = () -> System.out.println("Hello World With Lamda");
//runnableLambda.run();


//dont
//Runnable runnableLambda = () -> {
//System.out.println("Hello World With Lamda");
// System.out.println("Hello World With Lamda");
//}
//runnableLambda.run();