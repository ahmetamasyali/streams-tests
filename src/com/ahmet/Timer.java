package com.ahmet;

import java.util.Date;

public class Timer
{

    public static void withTime(Runnable runnable)
    {
        long time =  new Date().getTime();

        System.out.println("Started : ");
        try
        {
            runnable.run();
        }
        finally
        {
            long finishTime =  new Date().getTime();

            System.out.println("Ended : " + (finishTime - time));
        }
    }
}
