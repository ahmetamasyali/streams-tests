package com.ahmet;

import java.util.Date;

public class Timer
{

    public static void withTime(Runnable runnable)
    {
        long time =  System.nanoTime();

        System.out.println("Started : ");
        try
        {
            runnable.run();
        }
        finally
        {
            long finishTime =  System.nanoTime();

            System.out.println("Ended : " + (finishTime - time) / 1000000000.0 + " seconds");
        }
    }
}
