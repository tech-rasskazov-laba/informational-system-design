package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample implements Runnable
{
    private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void run()
    {
        System.out.println(format.format(new Date()));
    }
}
