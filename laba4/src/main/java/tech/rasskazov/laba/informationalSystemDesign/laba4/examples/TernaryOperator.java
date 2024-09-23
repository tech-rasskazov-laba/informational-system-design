package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

public class TernaryOperator implements Runnable
{
    private static final boolean flag = false;

    @Override
    public void run()
    {
        Number n = flag ? new Integer(1) : new Double(2.0);
    }
}
