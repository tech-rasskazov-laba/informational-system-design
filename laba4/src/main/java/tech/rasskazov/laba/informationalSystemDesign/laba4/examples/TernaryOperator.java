package tech.rasskazov.laba.informationalSystemDesign.laba4.examples;

public class TernaryOperator implements Runnable
{
    private static boolean flag1 = false;
    private static boolean flag2 = true;

    @Override
    public void run()
    {
        Integer n = flag1 ? 1 : flag2 ? 2 : null;
        System.out.println(subExample(5));
    }

    private double subExample(int idx)
    {
        double[] vals = new double[] {1.0, 2.0, 3.0};
        return (idx < 0 || idx >= vals.length) ? null : vals[idx];
    }
}
