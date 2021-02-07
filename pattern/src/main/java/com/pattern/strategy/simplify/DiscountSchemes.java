package com.pattern.strategy.simplify;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class DiscountSchemes {


    public static Discount activityPrice = (price) -> 0.8 * price;

    public static Discount memberPrice = (price) -> 0.5 * price;

}
