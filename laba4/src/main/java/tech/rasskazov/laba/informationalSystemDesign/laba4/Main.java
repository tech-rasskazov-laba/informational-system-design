package tech.rasskazov.laba.informationalSystemDesign.laba4;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.*;

public class Main
{
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args)
    {
        Reflections reflections = new Reflections(Main.class.getPackage().getName() + ".examples", Scanners.SubTypes);
        reflections.getSubTypesOf(Runnable.class).stream().map((clazz) -> {
            try {
                Constructor<? extends Runnable> ctor = clazz.getDeclaredConstructor();
                return ctor.newInstance();
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }).filter(Objects::nonNull).forEach(executor::execute);

        executor.shutdown();
    }
}
