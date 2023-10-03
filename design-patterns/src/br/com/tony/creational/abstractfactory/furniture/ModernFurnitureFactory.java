package br.com.tony.creational.abstractfactory.furniture;

public class ModernFurnitureFactory implements FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
