package br.com.tony.creational.abstractfactory.furniture;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("VictorianCoffeeTable has legs");
    }
}
