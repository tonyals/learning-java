package br.com.tony.creational.abstractfactory.furniture;

public class VictorianFurnitureFactory implements FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
