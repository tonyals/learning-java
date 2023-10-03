package br.com.tony.creational.abstractfactory.furniture;

public class FurnitureAbstractFactoryClient {
    public static void main(String[] args) {
        FurnitureAbstractFactory modernFurnitureFactory = new ModernFurnitureFactory();
        FurnitureAbstractFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        Chair victorianChair = victorianFurnitureFactory.createChair();
        CoffeeTable modernCoffeeTable = modernFurnitureFactory.createCoffeeTable();
        CoffeeTable victorianCoffeeTable = modernFurnitureFactory.createCoffeeTable();

        modernChair.sitOn();
        modernChair.hasLegs();
        modernCoffeeTable.hasLegs();

        victorianChair.sitOn();
        victorianChair.hasLegs();
        victorianCoffeeTable.hasLegs();
    }
}
