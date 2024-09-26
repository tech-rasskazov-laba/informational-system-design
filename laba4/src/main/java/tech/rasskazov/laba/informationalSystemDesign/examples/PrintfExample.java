package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

public class PrintfExample implements Runnable
{
    @Override
    public void run()
    {
        System.out.printf("%s\n", "str#1");
        System.out.println("str#2");
    }
}
