package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

import java.math.BigDecimal;

public class BigDecimalExample implements Runnable
{
    @Override
    public void run()
    {
        BigDecimal d1 = new BigDecimal("1.1");
        BigDecimal d2 = new BigDecimal("1.100");
        System.out.println(d1.equals(d2));
    }
}
