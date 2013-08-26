package com.rohan.core.shop;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 8/25/13
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class DiscountFactoryBean extends AbstractFactoryBean{
    private Product product;
    private double discount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public Class<?> getObjectType() {
        return product.getClass();
    }

    @Override
    protected Object createInstance() throws Exception {
        product.setPrice(product.getPrice() * (1 - discount));
        return product;
    }
}
