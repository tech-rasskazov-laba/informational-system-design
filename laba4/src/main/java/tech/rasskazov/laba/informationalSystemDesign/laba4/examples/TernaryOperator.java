package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

public class TernaryOperator implements Runnable
{
    private static boolean flag = false;
    private static boolean flag1 = true;
    private static boolean flag2 = false;

    @Override
    public void run()
    {
        this.example1();
        this.example2();
        System.out.println(subExample(5));
    }

    private void example1()
    {
        Number n = flag ? new Integer(1) : new Double(2.0);
        System.out.println(n);
    }

    private void example2()
    {
        Integer n = flag1 ? 1 : flag2 ? 2 : null;
        System.out.println(n);
    }

    private double subExample(int idx)
    {
        double[] vals = new double[] {1.0, 2.0, 3.0};
        return (idx < 0 || idx >= vals.length) ? null : vals[idx];
    }
}
