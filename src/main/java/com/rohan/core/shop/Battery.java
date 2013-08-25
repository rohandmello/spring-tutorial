package com.rohan.core.shop;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 8/4/13
 * Time: 7:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Battery extends Product{
    private boolean rechargeable;

    public Battery() {}

    public Battery(String name, double price, boolean rechargeable) {
        super(name, price);
        this.rechargeable = rechargeable;
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
