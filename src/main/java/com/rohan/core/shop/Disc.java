package com.rohan.core.shop;

/**
 * Created by IntelliJ IDEA.
 * User: Rohan.Dmello
 * Date: 8/4/13
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Disc extends Product{
    private int capacity;
    public Disc() {
    }

    public Disc(String name, double price) {
        super(name, price);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
