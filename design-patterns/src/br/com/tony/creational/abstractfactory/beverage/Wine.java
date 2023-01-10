package br.com.tony.creational.abstractfactory.beverage;

public class Wine implements Beverage {
    @Override
    public String drink() {
        System.out.println(this.getClass().getName());
        return this.getClass().getName();
    }
}
