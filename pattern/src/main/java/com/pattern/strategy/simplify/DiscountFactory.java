package com.pattern.strategy.simplify;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class DiscountFactory {
    private static DiscountFactory factory;

    private static final  Map<String, Method> map = new HashMap<>();

    static {
        init();
    }

    public static DiscountFactory getInstance() {
        if(factory == null) {
            factory = new DiscountFactory();
        }
        return factory;
    }

    private static void init() {
        Method[] methods = DiscountFactory.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Discount.class)) {
                map.put(method.getName(), method);
            }
        }
    }

    public static double discount(String type, double price) {
        return invoke(map.get(type), price);
    }

    private static double invoke(Method method, double price) {
        if(method == null) {
            return 0;
        }
        try {
            return (double) method.invoke(getInstance(), price);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }


    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    private static @interface Discount{

    }

    @Discount
    public double memberPrice(double price) {
        return 0.5 * price;
    }

    @Discount
    public double activityPrice(double price) {
        return 0.8 * price;
    }


}
