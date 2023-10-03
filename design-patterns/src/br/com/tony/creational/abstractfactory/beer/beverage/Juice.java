package br.com.tony.creational.abstractfactory.beer.beverage;

public class Juice implements Beverage {
    @Override
    public String drink() {
        System.out.println(this.getClass().getName());
        return this.getClass().getName();
    }
}
