package com.pattern.strategy.simplify;

/**
 * @author Yong
 * @date 2021/2/6
 */
public class ShopContext {

    private Discount discounter;

    private String discountType;

    public ShopContext(Discount discounter) {
        this.discounter = discounter;
    }

    public ShopContext(String discountType) {
        this.discountType = discountType;
    }

    public void setDiscounter(Discount discounter) {
        this.discounter = discounter;
    }

    public double discount(double originalPrice) {
        return discounter.apply(originalPrice);
    }

    public double discount2(double price) {
        return DiscountFactory.discount(discountType, price);
    }

}
