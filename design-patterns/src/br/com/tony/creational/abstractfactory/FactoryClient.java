package br.com.tony.creational.abstractfactory;

import br.com.tony.creational.abstractfactory.beverage.Beverage;

public class FactoryClient {
    public static void main(String[] args) {
        AbstractBeverageFactory alcoholicFactory = FactoryProducer.getBeverageFactory(true);
        Beverage wine = alcoholicFactory.getBeverage("WINE");
        wine.drink();
        Beverage beer = alcoholicFactory.getBeverage("BEER");
        beer.drink();

        AbstractBeverageFactory nonAlcoholicFactory = FactoryProducer.getBeverageFactory(false);
        Beverage water = nonAlcoholicFactory.getBeverage("WATER");
        water.drink();
        Beverage juice = nonAlcoholicFactory.getBeverage("JUICE");
        juice.drink();
    }
}
